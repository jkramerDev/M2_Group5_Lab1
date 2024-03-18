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
		if (obj == this)
            return true;
        if (!(obj instanceof Contact))
            return false;
		Contact c = (Contact) obj;
		
		boolean nameEqual = (contactName==null&&c.getContactName()==null)||contactName!=null&&contactName.equals(c.getContactName());
		boolean phonebookEqual=true;
		if (phoneBook==null&&c.getPhonebookEntries()==null)
			phonebookEqual = true;
		if (phoneBook!=null&&phoneBook.size()==c.getPhonebookEntries().size())
		{
			for(int i = 0;i<phoneBook.size();i++)
			{
				int typeCount = 0;
				for(int j = 0;j<phoneBook.size();j++)
				{
					
					if(phoneBook.get(i).getPhoneType().equals(c.getPhonebookEntries().get(j).getPhoneType()))
					{
						if(phoneBook.get(i).getPhoneNumber().equals(c.getPhonebookEntries().get(j).getPhoneNumber()))
							phonebookEqual = phonebookEqual&&true;
						else
							phonebookEqual = false;
					}
					else
						typeCount++;
				}
				if(typeCount==phoneBook.size())
				{
					phonebookEqual = false;
					break;
				}
			}
		}
		else
			phonebookEqual = false;
				
		return nameEqual && phonebookEqual;
	}
	
	
	
	
//test
	/*
	public static void main(String[] args)
	{
		Contact c1 = new Contact("John");
		c1.addPhonebookEntry("2033334000", "home");
		c1.addPhonebookEntry("2036334740", "work");
		c1.addPhonebookEntry("2043534030", "cell");
		
		Contact c2 = new Contact("Max");
		
		c2.addPhonebookEntry("2033334000", "home");
		c2.addPhonebookEntry("2036334740", "work");
		c2.addPhonebookEntry("2043534030", "cell");
		
		Contact c3 = new Contact("Meg");
		
		c3.addPhonebookEntry("2033334000", "home");
		c3.addPhonebookEntry("2036334740", "work");
		c3.addPhonebookEntry("2043534030", "cell");
		
		Contact c4 = new Contact("James");
		
		c4.addPhonebookEntry("2033334000", "home");
		c4.addPhonebookEntry("2036334740", "work");
		c4.addPhonebookEntry("2043534030", "cell");
		
		Contact c5 = new Contact("Alec");
		
		c5.addPhonebookEntry("2033334000", "home");
		
		Contact c6 = new Contact("Rob");
		
		c6.addPhonebookEntry("2033334000", "home");
		c6.addPhonebookEntry("2043534030", "cell");
		
		System.out.println(c1.equals(c2));
		System.out.println("c1 hash:" + c1.hashCode());
		System.out.println("c2 hash:" + c2.hashCode());
		System.out.println("c3 hash:" + c3.hashCode());
		System.out.println("c4 hash:" + c4.hashCode());
		System.out.println("c5 hash:" + c5.hashCode());
		System.out.println("c6 hash:" + c6.hashCode());
		
	}
	*/
}

//test
