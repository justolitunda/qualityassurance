/*

package ac.ke.egerton.egerton.controllers;


import ac.ke.egerton.egerton.Service.StudentService;
import ac.ke.egerton.egerton.model.Staff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.*;

@Controller
@RequestMapping("/staff")
public class StaffController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private StaffService;


    @GetMapping("/home")
    public ModelAndView home(ModelAndView mav,
                             HttpServletRequest req) {

        HttpSession session = req.getSession();
        Staff staff = (Staff) session.getAttribute("staff");

        mav.addObject("username", staff.getFullName());
        mav.setViewName("/staff/home");
        return mav;
    }


    //view all applications
    @RequestMapping(value = "/viewall", method = RequestMethod.GET)
    public ModelAndView allApplications(ModelAndView mav,
                                        HttpServletRequest req,
                                        @RequestParam(defaultValue = "0") int page) {

        HttpSession session = req.getSession();
        Staff staff = (Staff) session.getAttribute("staff");
        String levelOfCoordinator = staff.getCoordinatorLevel();

        //get all students based on staff department
        List<Student> allStudents = new ArrayList<>();
        if (levelOfCoordinator.equals("Faculty")){
                allStudents = studentService.getStudentsByFacultyId(staff.getFaculty().getId(), new PageRequest(page, 15, new Sort(Sort.Direction.ASC, "studentNumber"))).getContent();

        }

        mav.addObject("username", staff.getFullName());
        mav.addObject("students", allStudents);

        mav.setViewName("/staff/view");

        return mav;
    }


    //Access student aproval view
    @GetMapping("/pending")
    public ModelAndView pending(ModelAndView mav,
                                HttpServletRequest req,
                                @RequestParam(defaultValue = "0") int page) {

        //Find authenticated  staff  object
        HttpSession session = req.getSession();
        Staff staff = (Staff) session.getAttribute("staff");
        String levelOfCoordinator = staff.getCoordinatorLevel();

        //get all students based on staff department
        List<Student> allStudents = new ArrayList<>();
        List<Student> newStudentList = new ArrayList<>();
        HashSet<Student> studentHashSet = new HashSet<>();
        if (levelOfCoordinator.equals("Faculty")){
            allStudents = studentService.getStudentsByFacultyId(staff.getFaculty().getId(), new PageRequest(page, 15, new Sort(Sort.Direction.ASC, "studentNumber"))).getContent();
        }else {
            allStudents = studentService.getByDepartmentPageable(staff.getDepartment().getId(), new PageRequest(page, 15, new Sort(Sort.Direction.ASC, "studentNumber")));
        }


        newStudentList.addAll(studentHashSet);

        mav.addObject("username", staff.getFullName());
        mav.addObject("students", newStudentList);
        mav.setViewName("staff/pending");
        return mav;
    }

    //Access view for approved applications
    @GetMapping("/approved")
    public ModelAndView approved(ModelAndView mav,
                                 HttpServletRequest req,
                                 @RequestParam(defaultValue = "0") int page) {

        //Find authenticated  staff  object
        HttpSession session = req.getSession();
        Staff staff = (Staff) session.getAttribute("staff");
        String levelOfCoordinator = staff.getCoordinatorLevel();

        //get all students based on staff department
        List<Student> allStudents = new ArrayList<>();
        if (levelOfCoordinator.equals("Faculty")){
            allStudents = studentService.getStudentsByFacultyId(staff.getFaculty().getId(), new PageRequest(page, 15, new Sort(Sort.Direction.ASC, "studentNumber"))).getContent();

        }

        mav.addObject("username", staff.getFullName());
        mav.addObject("students", allStudents);
        mav.setViewName("staff/approved");
        return mav;
    }

    //Access view disapproved apps
    @GetMapping("/disapproved")
    public ModelAndView disapproved(ModelAndView mav,
                                 HttpServletRequest req,
                                    @RequestParam(defaultValue = "0") int page) {

        //Find authenticated  staff  object
        HttpSession session = req.getSession();
        Staff staff = (Staff) session.getAttribute("staff");
        String levelOfCoordinator = staff.getCoordinatorLevel();

        //get all students based on staff department
        List<Student> allStudents = new ArrayList<>();
        if (levelOfCoordinator.equals("Faculty")){
            allStudents = studentService.getStudentsByFacultyId(staff.getFaculty().getId(), new PageRequest(page, 15, new Sort(Sort.Direction.ASC, "studentNumber"))).getContent();


        }

        mav.addObject("username", staff.getFullName());
        mav.addObject("students", allStudents);
        mav.setViewName("staff/rejected");
        return mav;
    }
}
*/
