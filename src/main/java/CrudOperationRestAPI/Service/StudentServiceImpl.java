package CrudOperationRestAPI.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import CrudOperationRestAPI.Model.Student;
import CrudOperationRestAPI.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentServiceI {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public boolean saveStudent(Student stu)
	{
		Student student = studentRepository.save(stu);
		if(student !=null) {
			return true;
		}else {
			
	
		return false;
	
}}}
