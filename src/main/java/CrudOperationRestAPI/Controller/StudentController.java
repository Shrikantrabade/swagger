package CrudOperationRestAPI.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import CrudOperationRestAPI.Model.Student;
import CrudOperationRestAPI.Service.StudentServiceI;

@RestController
public class StudentController {

	@Autowired
	private StudentServiceI studentServiceI;
	
	@PostMapping(value="/saveStudent",consumes= {"application/json"})
	public ResponseEntity<String> saveStudent(@RequestBody  Student stu){
		boolean student = studentServiceI.saveStudent(stu);
		
		if(student) {
			String msg="Student saved successfully";
			return new ResponseEntity<String>( msg,HttpStatus.CREATED);
		}else {
		String msg="Student not saved succefully";
		return new ResponseEntity<String>(msg,HttpStatus.BAD_REQUEST);
		
		
	
	}}
	
	
}
