package template;

/**
 *   model a PhonebookEntry 
 *   
 *   PhonebookEntry has a phoneNumber and type
 *   
 *   
 *   
 */

class PhonebookEntry{
	
	private String phoneNumber;
	private String phoneType;
	public PhonebookEntry(String number, String type)
	{
		phoneNumber = number;
		phoneType = type;
	}

	public String getPhoneNumber()
	{
		return phoneNumber;
	}
		
	public String getPhoneType()
	{
		return phoneType;
	}
	
		
}
	