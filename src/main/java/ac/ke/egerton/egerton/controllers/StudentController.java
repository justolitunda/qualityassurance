package ac.ke.egerton.egerton.controllers;

import ac.ke.egerton.egerton.Service.StudentService;
import ac.ke.egerton.egerton.model.Student;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.io.IOException;
import java.util.Map;

@Controller
@RequestMapping("/student")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class StudentController {

    @Autowired
    private StudentService studentService;
    private BCryptPasswordEncoder passwordEncoder;
 
    public StudentController(StudentService studentService,
                             BCryptPasswordEncoder passwordEncoder) {
        super();
        this.studentService = studentService;
        this.passwordEncoder = passwordEncoder;
    }

    //  /student/re
    @GetMapping("/register")
    public ModelAndView register() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("student", new Student());
        mav.addObject("faculty", studentService.getFaculties());
        mav.setViewName("/student/register");
        return mav;

    }

    @PostMapping("/register")
    public ModelAndView createNewUser(@Valid @ModelAttribute Student student,
                                      BindingResult result,
                                      ModelAndView mav,
                                      RedirectAttributes attributes,
                                      @RequestParam Map<String, String> requestParams,
                                      HttpServletRequest request,
                                      HttpServletResponse response) throws ServletException, IOException {

        Student student1 = studentService.
                findStudentByStudentNumber(student.getStudentNumber());
        if (student1 != null) {
            attributes.addAttribute("faculty", studentService.getFaculties());
            result.rejectValue("studentNumber", "error.studentNumber",
                    "There is already a Student registered with the registration number provided.");
//            result.addError(new ObjectError("studentNumber",
//                    "There is already a Student registered with the registration number provided."));
        }
        if (result.hasErrors()) {
//            mav.addObject("student", new Student());
            mav.addObject("faculty", studentService.getFaculties());
            mav.setViewName("/student/register");
        } else {

            // Set password for the new user
            String password = requestParams.get("password");

            student.setPassword(passwordEncoder.encode(password));
            System.out.println("\n\n"+student+"\n\n");
            studentService.addStudent(student);
            mav.addObject("successMessage",
                    "Student has been registered successfully");

            mav.setViewName("redirect:/login");
        }
        return mav;
    }


    @GetMapping("/home")
    public ModelAndView home(ModelAndView mav,
                             HttpServletRequest req) {

        HttpSession session = req.getSession();
        Student student = (Student)session.getAttribute("student");

        mav.addObject("user", student);
        mav.addObject("student", student.getFullName());

        mav.setViewName("/student/home");

        return mav;
    }

}
