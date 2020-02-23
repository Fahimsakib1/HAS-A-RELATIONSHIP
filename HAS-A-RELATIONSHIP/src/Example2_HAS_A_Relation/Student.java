package Example2_HAS_A_Relation;

public class Student 
{    
    int Roll;
    String ID;
    String Dept;
    Name name;
    Address address;
    
    
	    public Student(int roll, String iD, String dept, Name name, Address address) 
	    
	    {
		
		Roll = roll;
		ID = iD;
		Dept = dept;
		this.name = name;
		this.address = address;
		
	    }
	    
	    public void display ()
	    {
	    	System.out.println(" First Name  : " +name.FirstName);
	    	System.out.println(" Middle Name  : " +name.MiddleName);
	    	System.out.println(" Last Name  : " +name.LastName);
	    	System.out.println(" Nick Name  : " +name.NickName);
	    	
	    	System.out.println(" Road Number : " +address.Road);
	    	System.out.println(" Area  : " +address.Area);
	    	System.out.println(" City Is : " +address.City);
	    	System.out.println(" Country : " +address.Country);
	    	
	    	System.out.println(" Roll Number : " +Roll);
	    	System.out.println(" Id Number : " +ID);
	    	System.out.println(" Department  : " +Dept);
	    	
	    	
	    }
    
    
    
}
