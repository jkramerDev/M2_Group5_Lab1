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
	
	private Map<Contact, List<PhonebookEntry>> phonebook;
	
	public PhonebookHandler(Map<Contact, List<PhonebookEntry>> phonebook) {
		this.phonebook = phonebook;
	}
	
	@Override
	public List<PhonebookEntry> binarySearch(List<Contact> sortedContacts, String name){
		int first = 0;
		int last = sortedContacts.size() - 1;
		while(first <= last) {
			int midpoint = first + (last - first)/2;
			String contact = sortedContacts.get(midpoint).getContactName();
			int compare = name.compareTo(contact);
			if(compare == 0) {
				return sortedContacts.get(midpoint).getPhonebookEntries();
			}else if (compare < 0){
				last = midpoint - 1;
			}else {
				first = midpoint + 1;
			}
		}
		return null;
	}
	
	@Override
	public List<Contact> sortByName() {
	    List<Contact> names = new ArrayList<>(phonebook.keySet());

	    
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
		System.out.println("Sorted Phonebook (Bubble Sort)");
	    for (Contact contact : sortedContacts) {
	        System.out.println(contact.getContactName());
	    }
	}
}
	
	