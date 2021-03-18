//lex_auth_0128946702693826564
//do not modify the above line

package setinterfaceassignment1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Tester {

	public static Set<Student> findUnique(List<Student> students) {
		//Implement your logic here and change the return statement accordingly 
		return null;
	}

	public static Set<Student> findDuplicates(List<Student> students) {
		//Implement your logic here and change the return statement accordingly 
		return null;
	}
	
	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();

		students.add(new Student(5004, "Wyatt", "Wyatt@example.com","Dance"));
		students.add(new Student(5010, "Lucy", "Lucy@example.com","Dance"));
		students.add(new Student(5550, "Aaron", "Aaron@example.com","Dance"));
		students.add(new Student(5560, "Ruby", "Ruby@example.com","Dance"));
		students.add(new Student(5015, "Sophie", "Sophie@example.com","Music"));
		students.add(new Student(5013, "Clara", "Clara@example.com","Music"));
		students.add(new Student(5010, "Lucy", "Lucy@example.com","Music"));
		students.add(new Student(5011, "Ivan", "Ivan@example.com","Music"));
		students.add(new Student(5550, "Aaron", "Aaron@example.com","Music"));

		Set<Student> studentNominations = findUnique(students);
		System.out.println("Students who have submitted nominations");
		for(Student student: studentNominations)
		    System.out.println(student);

		Set<Student> duplicateStudents = findDuplicates(students);
		System.out.println("Students who have submitted nominations for both the events");
		for(Student student: duplicateStudents)
		    System.out.println(student);
	}
}
