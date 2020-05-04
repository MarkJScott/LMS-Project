//Import packages 
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.regex.*;

public class Login {
	
	//Variables
	 static String userName;
	 static String password;
	
	//Methods
	
/**	public Login(String uN, String pW) {
		userName = uN;
		password = pW;
	} **/
	/** 
	 * prompt() method displays message asking for user
	 * to input their username and then their password.
	 * It then checks the correctness with checkUserName()
	 * and the checkPassword() methods.
	 * @throws FileNotFoundException 
	 */
	static boolean prompt() throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your username: ");
		
		userName = input.nextLine();
		
		System.out.println("Please enter your password: ");
		password = input.nextLine();
		input.close();
		
		if(checkUserName(userName)) {
			if(checkPassword(password)) {
			return true;
			}
		}
		return false;
	}
	
	/**
	 * 
	 * @param userName
	 * @return true or false
	 * @throws FileNotFoundException
	 */
	static boolean checkUserName(String userName) throws FileNotFoundException {
		
		boolean isAdmin = false;
		boolean isUser = false;
		
		//Declare File object
		File file = new File("LMS/src/userinfo.txt");
		
		//Initialize Scanner
		Scanner scan = new Scanner(file);
		
		while(scan.hasNextLine()) {
			//scan for usernames
			String a = scan.findInLine(Pattern.compile("admin"));
			String u = scan.findInLine(Pattern.compile("user"));
			
			if(a == "admin") {
				isAdmin = true;
			}
			else {
				isAdmin = false;
			}
			
			if(u == "user") {
				isUser = true;
			}
			else {
				isUser = false;
			}
			scan.nextLine();
			
		}
		scan.close();
		
		if(isAdmin || isUser) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	/**
	 * 
	 * @param password
	 * @return true or false
	 * @throws FileNotFoundException
	 */
	static boolean checkPassword(String password) throws FileNotFoundException {
		
		boolean adminPassword = false;
		boolean userPassword = false; 
		
		//Declare File object
		File file = new File("LMS/src/userinfo.txt");
		
		//Initialize Scanner
		Scanner scan = new Scanner(file);
		
		while(scan.hasNextLine()) {
			//Scan for passwords
			String ap = scan.findInLine(Pattern.compile("1234"));
			String up = scan.findInLine(Pattern.compile("5678"));
			
			//Check if adminPassword
			if(ap == "1234") {
				adminPassword = true;
			}
			else {
				adminPassword = false;
			}
			
			//Check if userPassword
			if(up == "5678") {
				userPassword = true;
			}
			else{
				userPassword = false;
			}
			scan.nextLine();
		}
		scan.close();
		
		if(adminPassword || userPassword){
			return true;
		}
		else {
			return false;
		}
	}
	
	static void error() throws FileNotFoundException {
		System.out.println("You have entered the wrong information. Please try again");

	}
}
