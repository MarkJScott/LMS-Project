
import java.io.*;
import java.io.IOException;

public class UserFunctions {

	//Variables
	String name;
	int idNumber;	
	String courses;
	double gpa;
	boolean isAdmin; 
	
	//Methods
	public UserFunctions(String userName, 
			int userIDNumber, 
			boolean adminStatus) {
		name = userName;
		idNumber = userIDNumber;
		isAdmin = adminStatus; 
	}
		
	static void displayData() {
			
		}
		
	double calculateGPA() {
		return 3.2;
		}
		
	static void addClass() throws IOException {
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("userinfo.txt",true)));
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String name = reader.readLine();
			out.println(name);
			out.close();
		}
		
	static void deleteClass() {
			
		}
		
	static void addGrade() throws IOException {
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("userinfo.txt",true)));
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String name = reader.readLine();
		out.println(name);
		out.close();
		}
		
	static void deleteGrade() {
			
		}
		
	static void edit() {
			
		}
}
