package template;

import java.util.*;

/**
 * PhonebookHandler - supports 
 * Phonebook operations
 * 
 * Use a map to build the Phonebook
 * key: Contact
 * value: List<phonebookEntries>
 */

public class PhonebookHandler implements iPhonebookHander{
	
	@Override
	public List<PhonebookEntry> binarySearch(List<Contact> sortedContacts, String name){
		
	}
	
	
	@Override
	public List<Contact> sortByName(){
		
		List<String> names = new ArrayList<>(phonebook.keySet());
		
		for (int i = 0; i < names.size() - 1; i++) {
            for (int j = 0; j < names.size() - (i - 1); j++) {
                if (names.get(j).compareTo(names.get(j + 1)) > 0) {
                	
                
                	String temp = names.get(j);
                    names.set(j, names.get(j + 1));
                    names.set(j + 1, temp);
                }
            }
	}
	
	@Override
	public void display(List<Contact> sortedContacts) {
		
	}
	
	
}
	
	