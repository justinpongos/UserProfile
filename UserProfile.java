
public class UserProfile {

	//tablet
	//instance variables
	private String name;
	private String nationality;
	private int age;
	private int height;

	public UserProfile () {
		this.name = "Billy Bob";
		this.nationality = "American";
		this.age = 16;
		this.height = 62;
	
	}//end zero argument statement
	
	public UserProfile (String name, String nationality, int age, int height) {
		this.name = name;
		this.nationality = nationality;
		this.age = age;
		this.height = height;
	}//end 2nd zero argument 
	
	public String toString ( ) {
		String output;
		output = ("The users name is " + name + ", their nationality is " + nationality + ", they are " + age + " years old, and " + height + " inches tall");
		return output;
	}//end toString
}//end class
