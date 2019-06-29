package ac.ke.egerton.egerton.repositories;





import ac.ke.egerton.egerton.model.Evaluate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("evaluateRepository")
public interface EvaluateRepository extends JpaRepository<Evaluate, String>{
   /* Evaluate findByTotalScore(Integer Score);

    Evaluate findByProgId(String progId);

    void deleteByProgId(String id);

    //find all programs based on department
    Page<Evaluate> findAllByDepartmentId(int id, Pageable pageable);

  *//*  List<Evaluate> findByDepartmentId(int id);

    //find all programs based on department
    Page<Evaluate> findAllByFaculty(Faculty faculty, Pageable pageable);

    //find all programs based on department
    Page<Evaluate> findAllByFacultyId(int facultyId, Pageable pageable);

    List<Evaluate> findAllByFaculty(Faculty faculty);

*/

}



