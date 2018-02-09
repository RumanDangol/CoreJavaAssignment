package assignmentCoreJava;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import converter.JavaObjectModel;


public class WriteData {

	public static void main(String[] args) throws IOException {
		List<JavaObjectModel> details = new ArrayList<JavaObjectModel>();
		
		/**
		 * creates object of JsonToJava class as changeIntoJava 
		 * gets the java objects into details
		 * deserialization function reads Json file and converts into list of javaobjects and return the list
		 * 
		 */
		
		JsonToJava changeIntoJava = new JsonToJava();
		details = changeIntoJava.deserialization();
		
		
		
		
		
		/**
		 * creates object of keyPeople as showkeyPeople 
		 * displayCompany Name taking list of details 
		 * where the keyPeople>o in the console
		 */
		
		KeyPeople showkeyPeople = new KeyPeople();
		showkeyPeople.displayCompanyNameWhichhasKeyPerson(details);
		
		/**
		 * creates object of DisplayCompany as company
		 * showCompanyNameandDescription function writes the company name and description in file company.json
		 */
		DisplayCompany company = new DisplayCompany();
		company.writeCompanyNameandDescription(details);
		/**
		 * displays company name and its fax no if the company has fax no 
		 * Data has fax no startin with country code 1 so removed country code
		 * Change fax no from String to long and deleting - sign between no
		 * 
		 */
		FaxNo fax = new FaxNo();
		fax.showFaxnoAndCompanyInConsole(details);
				
		
		
		
		

	}
		

}
