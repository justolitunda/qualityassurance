
package ac.ke.egerton.egerton.repositories;


import ac.ke.egerton.egerton.model.Staff;
import ac.ke.egerton.egerton.model.enumerated.Gender;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StaffRepository extends JpaRepository<Staff, String> {
	
		Staff findByPayrollId(String payrollId);
		Staff findByEmail(String email);
		void deleteByPayrollId(String id);

	    //find by name
	    Page<Staff> findAllByFullNameContains(String name, Pageable pageable);

	    //find by payrollno
		Page<Staff> findAllByPayrollId(String name, Pageable pageable);

		//find all by faculty
		Page<Staff> findAllByFaculty(String faculty, Pageable pageable);

		//find all by department
		Page<Staff> findAllByDepartment(String department, Pageable pageable);

		//find all by gender
		Page<Staff> findAllByGender(Gender gender, Pageable pageable);


}

