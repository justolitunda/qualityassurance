package ac.ke.egerton.egerton.repositories;

import ac.ke.egerton.egerton.model.Department;
import ac.ke.egerton.egerton.model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

    List<Department> findByFaculty(Faculty faculty);
    Department findDepartmentById(int id);

}
