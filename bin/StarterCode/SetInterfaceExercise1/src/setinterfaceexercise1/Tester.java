//lex_auth_012960632944271360189
//do not modify the above line

package setinterfaceexercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class Tester {

	public static Set<Student> findDuplicateEntries(List<Student> students) {
		//Implement your logic here and change the return statement accordingly 
		return null;
	}
	
	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();

		students.add(new Student(1001, "Dean", 111));
		students.add(new Student(1002, "Harley", 112));
		students.add(new Student(1003, "Franklin", 113));
		students.add(new Student(1005, "Arden", 113));
		students.add(new Student(1100, "Juliet", 112));
		students.add(new Student(1003, "Franklin", 111));
		students.add(new Student(1001, "Dean", 114));

		Set<Student> duplicateStudents = findDuplicateEntries(students);
		System.out.println("Students who have applied for re-evaluation in more than one subject");
		for(Student student: duplicateStudents)
		    System.out.println(student);
	}
}