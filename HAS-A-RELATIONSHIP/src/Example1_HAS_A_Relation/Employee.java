package Example1_HAS_A_Relation;

public class Employee 

{
       int ID;
       String Name;
       Address address;
       
       
	public Employee(int iD, String name, Address address) 
	
	{
		super();
		
		ID = iD;
		Name = name;
		this.address = address;
		
	}

	
	 public void show ()
	 {
		 
		 
		 System.out.println(" Id Is : " + ID);
		 System.out.println(" Name Is : " + Name);
		 
		 System.out.println(" Road Number : " + address.Road);
		 System.out.println(" Area Is : " + address.Area);
		 System.out.println(" District Is  : " + address.District);
		 System.out.println(" Country Name : " + address.Country);
		 
	 }
	
	/**public static void main ( String[] args)
	{
		
		Address A1 = new Address (3, " Balubari ", " Dinajpur", " Bangladesh ");
		Employee E1 = new Employee (123, " Fahim ", A1);
		E1.show();
		
		System.out.println(" ---------------------------------------- ");
		
		Address A2 = new Address (8, " Nimtola ", " Rangpur", " Bangladesh ");
		Employee E2 = new Employee (456, " Faysal ", A2);
		E2.show();
		
		
	}**/
	
	
}
