package Example1_HAS_A_Relation;

public class Test 

{

	public static void main(String[] args) 
	
	{
	    
		Address A1 = new Address (3, " Balubari ", " Dinajpur", " Bangladesh ");
		Employee E1 = new Employee (123, " Fahim ", A1);
		E1.show();
		
		System.out.println(" ---------------------------------------- ");
		
		Address A2 = new Address (8, " Nimtola ", " Rangpur", " Bangladesh ");
		Employee E2 = new Employee (456, " Faysal ", A2);
		E2.show();
		

	}

}
