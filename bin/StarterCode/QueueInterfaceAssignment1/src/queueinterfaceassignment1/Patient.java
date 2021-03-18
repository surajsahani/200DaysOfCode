//lex_auth_012990565827108864230
//do not modify the above line

package queueinterfaceassignment1;

public class Patient {

	private String name;
	private String gender;
	private int age;
	
	public Patient(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Name: "+this.name+", Gender: "+this.gender+", Age: "+this.age;
	}
}
