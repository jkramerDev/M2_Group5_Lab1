package template;

import java.util.ArrayList;
import java.util.List;

/**
 * model a Contact 
 * Contact has a name & list of phonebook entries
 * 
 * Support adding phonebookEntry to a contact
 * 
 * @Override hashCode and equals
 * 
 */

class Contact {
	 
	private String contactName;
	private List<PhonebookEntry> phoneBook = new ArrayList<>();
	
	public Contact(String name)
	{
		contactName=name;
	}
	
	public String getContactName()
	{
		return contactName;
	}
	
	public void addPhonebookEntry(String number, String type)
	{
		phoneBook.add(new PhonebookEntry(number,type));
	}
	
	public List<PhonebookEntry> getPhonebookEntries()
	{
		return phoneBook;
	}
	
	@Override
	public int hashCode()
	{
		int num = contactName.length();
		num=num*phoneBook.size();
		return num+6;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		return false;
	}
	
	
	
	
//test
	public static void main(String[] args)
	{
		Contact c1 = new Contact("John");
		c1.addPhonebookEntry("2033334000", "home");
		c1.addPhonebookEntry("2036334740", "work");
		c1.addPhonebookEntry("2043534030", "cell");
	}
}

//test
