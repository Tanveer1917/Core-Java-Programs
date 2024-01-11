package inheritance1;

import java.util.Scanner;

public class TestMethod 
{
	public static void main(String[] args)
	{
		Hosteller Status = new Hosteller();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the Student Name");
		String name=sc.next();
		
		System.out.println("Enter the StudentId");
		int StudentId=sc.nextInt();
		
		System.out.println("Enter the DepartementId");
		int DepartmentId=sc.nextInt();
		
		System.out.println("Enter the Student Gender");
        String gender=sc.next();
        
        System.out.println("enter the Phone number");
        String phone=sc.next();
        
        System.out.println("Hostel Name");
        String HostelName=sc.next();
        
        System.out.println("Hostel Number");
        String HostelNumber=sc.next();
        
       System.out.println("You want to change Your room Number(Y/N) ");
		String choice = sc.next();
		if(choice.equalsIgnoreCase("Y"))
		{
			String ChangeRN = getHostellerDetails(); 
			Status.setHostelNumber(ChangeRN);
		}
		else
		{
			System.out.println("Thank You");
		}
		System.out.println(" You want to change Your Phone Number (Y/N)");
		String pchoice = sc.next();
		if(pchoice.equalsIgnoreCase("Y"))
		{
			String Changephone = getHostellerDetails(); 
			Status.setPhone(Changephone);
		}
		else
		{
			System.out.println("Thank You");
		}
		System.out.println();
		System.out.println();
		System.out.println("**************Student Details***************");
		System.out.println(Status.getStudentId());
		System.out.println(Status.getName());
		
		System.out.println(Status.getGender());
		System.out.println(Status.getPhone());
		System.out.println(Status.getDepartmentID());
		System.out.println(Status.getHostelName());
		System.out.println(Status.getHostelNumber());
		
	}

	private static String getHostellerDetails() {
		// TODO Auto-generated method stub
		return null;
	}


}
    	   
    	   
        
        
        
        
        
        
		
		
		
	


