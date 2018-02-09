package assignmentCoreJava;

import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.List;

import converter.JavaObjectModel;
import converter.Keyperson;

public class KeyPeople {
	/**
	 * displays the companies which has one or more keypeople
	 * 
	 * 
	 */
	public void displayCompanyNameWhichhasKeyPerson(List<JavaObjectModel> details) {
		int len = details.size();
		for(int i=0; i<len;i++) {
			int sizeofKeyPeole = details.get(i).getKeyPeople().size();
			if(sizeofKeyPeole>0) {
				System.out.println(details.get(i).getKeyPeople());
			}
		
		}
	}
	public List<Integer> getKeyPeoleIndex(List<JavaObjectModel> details) {
		int len = details.size();
		List<Integer> index = new ArrayList<Integer>();
		for(int i=0; i<len;i++) {
			int sizeofKeyPeole = details.get(i).getKeyPeople().size();
			
			if(sizeofKeyPeole>0) {
				index.add(i);
				//System.out.println(details.get(i).getKeyPeople().get(i));
				
			}
		
		}
		return index;
	}
	public void displayKeypersonNamePositionURL(List<JavaObjectModel> details) {
		int len = details.size();
			for(int i=0; i<len;i++) {
				int sizeofKeyPeole = details.get(i).getKeyPeople().size();
	
					if(sizeofKeyPeole>0) {
			
						Keyperson people = new Keyperson();
			
			
						List<Keyperson> peoples = new ArrayList<Keyperson>();
			
							for(int j=0; j<sizeofKeyPeole ; j++) {
								people = details.get(i).getKeyPeople().get(j);
								peoples.add(people);
				
								System.out.println(peoples.get(j).getName());
								System.out.println(peoples.get(j).getUrl());
								System.out.println(peoples.get(j).getPosition());
		
		//System.out.println(details.get(i).getKeyPeople().get(j).getUrl());
							}
		
					}
			}
	}

}
