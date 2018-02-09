package assignmentCoreJava;

import java.util.List;

import converter.JavaObjectModel;

public class FaxNo {

	public void showFaxnoAndCompanyInConsole(List<JavaObjectModel> details) {
	/**
	 * displays company name and its fax no if the company has fax no 
	 * Data has fax no startin with country code 1 so removed country code
	 * Change fax no from String to long and deleting - sign between no
	 * 
	 */
		for(int i=0; i<details.size();i++) {
		int size = details.get(i).getFax().replaceAll("-", "").length();
			
				if(size>0) {
					String faxNoInString = details.get(i).getFax().replaceAll("(^1-)", "");
					String faxWithNoSign = faxNoInString.replaceAll("\\-", "");
					long faxNoInLong = Long.parseLong(faxWithNoSign);
					//System.out.println(faxNoInLong);
					System.out.println(faxNoInLong + ": \n" + details.get(i).getCompany());
				}
		}
	}
}
