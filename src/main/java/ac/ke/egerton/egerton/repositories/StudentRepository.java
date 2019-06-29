
package ac.ke.egerton.egerton.repositories;

import ac.ke.egerton.egerton.model.Faculty;
import ac.ke.egerton.egerton.model.Student;
import ac.ke.egerton.egerton.model.enumerated.Campus;
import ac.ke.egerton.egerton.model.enumerated.Gender;
import ac.ke.egerton.egerton.model.enumerated.Year;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {
    Student findByEmail(String email);

    Student findByStudentNumber(String number);

    void deleteByStudentNumber(String id);

    //find all students based on department
    Page<Student> findAllByDepartmentId(int id, Pageable pageable);

    List<Student> findByDepartmentId(int id);

    //find all students based on department
    Page<Student> findAllByFaculty(Faculty faculty, Pageable pageable);

    //find all students based on department
    Page<Student> findAllByFacultyId(int facultyId, Pageable pageable);

    List<Student> findAllByFaculty(Faculty faculty);

    //find all students by name
    Page<Student> findAllByFullNameContains(String name, Pageable pageable);

    //find all students by year
    Page<Student> findAllByCurrentYear(Year year, Pageable pageable);

    //find all students by gender
    Page<Student> findAllByGender(Gender gender, Pageable pageable);

    //find all students by campus name
    Page<Student> findAllByCampusNameLike(Campus campus, Pageable pageable);

    //find all students by Regno
    Page<Student> findAllByStudentNumber(String regno, Pageable pageable);


}

