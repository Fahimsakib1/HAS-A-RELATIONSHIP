package Example2_HAS_A_Relation;

public class Test 

{

	public static void main(String[] args) 
	
	{
		  Name N1 =new Name (" Fahim ", " Faysal ", " Sakib ", " Bro");
		  Address A1 = new Address ( 5 , " Balubari ", " Dinajpur ", " Bangladesh");
		  Student S1 = new Student (1 , " 17-35162-2 ", " CSE ", N1 , A1 );
		  S1.display();
		  
		  System.out.println("----------------------------- " );
		  
		  Name N2 =new Name (" Fami ", " Fuad ", " Saif ", " Little Bro");
		  Address A2 = new Address ( 8 , " Dhanmondi ", " Dhaka ", " Bangladesh");
		  Student S2 = new Student (2 , " 20-355521-3 ", " English ", N2 , A2 );
		  S2.display();
		  
		  
	}
		  
}
