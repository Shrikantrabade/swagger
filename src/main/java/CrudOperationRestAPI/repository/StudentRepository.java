package CrudOperationRestAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import CrudOperationRestAPI.Model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
	
	

}
