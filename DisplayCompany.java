package assignmentCoreJava;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import converter.JavaObjectModel;

public class DisplayCompany {
	
	public void writeCompanyNameandDescription(List<JavaObjectModel> details) throws IOException {
		/**
		 * write to file company.json
		 * display company : description
		 */
		int len = details.size();
		BufferedWriter writer = new BufferedWriter(new FileWriter("company.json"));
			for(int i=0; i<len; i++) {
				
				writer.write(details.get(i).getCompany()  + " : " +"\n"+  details.get(i).getDescription() + "\n");
				
			}
			writer.close();
		//System.out.println(details.get(i).getCompany() + " : " + details.get(i).getDescription());
			

	}

}
