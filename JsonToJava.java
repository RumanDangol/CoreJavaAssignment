package assignmentCoreJava;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import converter.JavaObjectModel;

public class JsonToJava {
	
	public  List<JavaObjectModel> deserialization() throws IOException {
		try(BufferedReader reader = new BufferedReader(new FileReader("/root/eclipse-workspace/Reader/toJson.json"))){
		
		
		String currentLine;
		List<JavaObjectModel> details = new ArrayList<JavaObjectModel>();

		
			while((currentLine = reader.readLine())!= null) {
			JavaObjectModel detail;
			
			detail = new Gson().fromJson(currentLine, JavaObjectModel.class);
			
			details.add(detail);
			
			}

		
		
			reader.close();
		
		return details;
	
			
			
		
		
		
	
		
	}
	}
}



