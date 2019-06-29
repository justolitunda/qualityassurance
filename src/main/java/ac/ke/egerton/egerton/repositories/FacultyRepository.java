package ac.ke.egerton.egerton.repositories;

import ac.ke.egerton.egerton.model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyRepository extends JpaRepository<Faculty, Integer> {

    Faculty findByFacultyName(String name);
    Faculty findFacultyById(int id);
}
