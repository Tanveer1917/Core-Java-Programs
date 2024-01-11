package com.overriding;

class Company {
	String msg = "Welcome to Everyone";

	public String SetRecrutmentProcedure() {

		return "Every company has strict evalution";

	}
}

class wipro extends Company {
	String msg = "Welcometi wipro limited";

	public String setRecruitmentProcedure() {
		return "minimum  55% in 10 and 12 is 60%" + "\n" + "in Degree should be above 60%" + "\n"
				+ "Aptitiude marks should be 60%";

	}
	}

	class Cognizant extends Company {

		String msg = "Welcome to Cognizant";
		public String setRecruitmentProcedure()
		{
			return"minimum  55% in 10 and 12 is 60%" + " \n"+ "in Degree should be above 60%" + "\n"+
					"Aptitiude marks should be 60%";
	}
	}

	public class TestMethodOverriding2
	{
		public static void main(String[] args)
		{
			Company cmd = null;
			cmd = new wipro();
			System.out.println(cmd.msg);
			String msg = cmd.SetRecrutmentProcedure();
			System.out.println(msg);
			System.out.println();
			
			cmd = new Cognizant();
			System.out.println(cmd.msg);
			String msg1;
			msg1 = cmd.SetRecrutmentProcedure();
			
			
	}

}
