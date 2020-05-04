import java.io.FileNotFoundException;




public class Main  {

	public static void main (String[] args) throws FileNotFoundException {
		
		//Call OpenGUI() to begin program
		
		//Call Login.prompt() to bring up login page.

		
		if(Login.prompt()) {
			//Call OpenGUI
		}
		else {
			Login.error();
		}
		
	}
}
