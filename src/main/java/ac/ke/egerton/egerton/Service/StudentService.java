
package ac.ke.egerton.egerton.Service;



import ac.ke.egerton.egerton.model.Department;
import ac.ke.egerton.egerton.model.Faculty;
import ac.ke.egerton.egerton.model.Student;
import ac.ke.egerton.egerton.model.enumerated.Campus;
import ac.ke.egerton.egerton.model.enumerated.Gender;
import ac.ke.egerton.egerton.model.enumerated.Role;
import ac.ke.egerton.egerton.model.enumerated.Year;
import ac.ke.egerton.egerton.repositories.DepartmentRepository;
import ac.ke.egerton.egerton.repositories.FacultyRepository;
import ac.ke.egerton.egerton.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepo;

    @Autowired
    private FacultyRepository facultyRepository;

    @Autowired
    private DepartmentRepository departmentRepository;


    public StudentService(StudentRepository studentRepo, FacultyRepository facultyRepository, DepartmentRepository departmentRepository) {
        this.studentRepo = studentRepo;
        this.facultyRepository = facultyRepository;
        this.departmentRepository = departmentRepository;

    }

//    public StudentService(StudentRepository studentRepo){
//        this.studentRepo = studentRepo;
//    }

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public Page<Student> getAllStudentsPageable(Pageable pageable) {
        return studentRepo.findAll(pageable);
    }

    //find student from database using student number
    public Student findStudentByStudentNumber(String id) {
        return studentRepo.findByStudentNumber(id);
    }


    //Register student
    public void addStudent(Student student) {
        student.setRole(Role.ROLE_STUDENT);
        //student.setPassword(bCryptPasswordEncoder.encode(student.getPassword()));

        studentRepo.save(student);
    }

//    public List<Faculty> getFaculties(){
//        return facultyRepository.findAll();
//    }
    public  List<Faculty> getFaculties(){
        return  facultyRepository.findAll();
    }
    public List<Department> getDepartments(){
        return departmentRepository.findAll();
    }

    public Faculty findByFacultyName(String name){
        return facultyRepository.findByFacultyName(name);
    }

    public  List<Department> findDepartmentsByFaculty(int id){
        return departmentRepository.findByFaculty(facultyRepository.findFacultyById(id));
    }

    public Faculty getFaculty(int id){
        return facultyRepository.findFacultyById(id);
    }

    public Department getDepartment(int id){
        return  departmentRepository.findDepartmentById(id);
    }


    public void updateStudent(Student student) {
        studentRepo.save(student);
    }

    public void deleteStudent(String id) {
        studentRepo.deleteByStudentNumber(id);
    }

    //find all students given department
    public List<Student> getByDepartment(int departmentId) {
        return studentRepo.findByDepartmentId(departmentId);
    }

    //find all students given department
    public Page<Student> getStudentsByFaculty(Faculty faculty, Pageable pageable) {
        return studentRepo.findAllByFaculty(faculty, pageable);
    }
    //find all students given department
    public Page<Student> getStudentsByFacultyId(int facultyId, Pageable pageable) {
        return studentRepo.findAllByFacultyId(facultyId, pageable);
    }

    //find all students given department
    public List<Student> getByDepartmentPageable(int department, Pageable pageable) {
        return studentRepo.findAllByDepartmentId(department, pageable).getContent();
    }

    //find all students given year
    public Page<Student> getStudenByCurrentYear(Year year, Pageable pageable) {
        return studentRepo.findAllByCurrentYear(year, pageable);
    }

    //find all students given gender
    public Page<Student> getAllByGender(Gender gender, Pageable pageable) {
        return studentRepo.findAllByGender(gender, pageable);
    }

    //find all students given name
    public Page<Student> getAllByFullName(String name, Pageable pageable) {
        return studentRepo.findAllByFullNameContains(name, pageable);
    }

    //find all students given year
    public Page<Student> getAllByCampusName(Campus campus, Pageable pageable) {
        return studentRepo.findAllByCampusNameLike(campus, pageable);
    }

    //find all students given year
    public Page<Student> getAllByStudentNumber(String regno, Pageable pageable) {
        return studentRepo.findAllByStudentNumber(regno, pageable);
    }
}

