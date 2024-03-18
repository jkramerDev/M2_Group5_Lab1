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
		int first = 0;
		int last = sortedContacts.size();
		int midpoint;
		while(first <= last) {
			midpoint = (first + last)/2;
			if(name.equals(sortedContacts.get(midpoint).getContactName())) {
				return sortedContacts.get(midpoint).getPhonebookEntries();
			}else if (name.compareTo(sortedContacts.get(midpoint).getContactName())){
				first = midpoint + 1;
			}else {
				last = midpoint - 1;
			}
		}
		
	}
	
	
	
	@Override
	public List<Contact> sortByName() {
	    List<Contact> names = new ArrayList<>(phonebook.keySet());

	    // Sorting the names using bubble sort
	    for (int i = 0; i < names.size() - 1; i++) {
	        for (int j = 0; j < names.size() - i - 1; j++) {
	            if (names.get(j).getContactName().compareTo(names.get(j + 1).getContactName()) > 0) {
	                Contact temp = names.get(j);
	                names.set(j, names.get(j + 1));
	                names.set(j + 1, temp);
	            }
	        }
	    }

	    return names;
	}
	
	@Override
	public void display(List<Contact> sortedContacts) {
	    for (Contact contact : sortedContacts) {
	        System.out.println("Contact: " + contact.getContactName());
	        System.out.println("Phone Numbers:");
	        List<PhonebookEntry> phoneNumbers = phonebook.get(contact);
	        for (PhonebookEntry entry : phoneNumbers) {
	            System.out.println(entry.getPhoneType() + ": " + entry.getPhoneNumber());
	        }
	        System.out.println(); // Add an empty line for better readability
	    }
	}
	
	
}
	
	