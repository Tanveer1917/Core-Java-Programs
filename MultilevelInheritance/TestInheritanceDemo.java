package MultilevelInheritance;

 class Person
{
	private String name;
	private String mobilenumber;
	private String address;
	
	
	public Person(String name, String mobilenumber, String address) {
		super();
		this.name = name;
		this.mobilenumber = mobilenumber;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}//close of Person class
	class Developer extends Person
	{
		String projectCode;
		String projectName;
		String projectSkill;
		
		public Developer(String name, String mobilenumber, String address, String projectCode, String projectName,
				String projectSkill) {
			super(name, mobilenumber, address);
			this.projectCode = projectCode;
			this.projectName = projectName;
			this.projectSkill = projectSkill;
		}
public String getProjectCode() {
			return projectCode;
		}

		public String getProjectName() {
			return projectName;
		}

		public String getProjectSkill() {
			return projectSkill;
		}
		
		
	}
		class Company extends Developer
		{
			String companyName;
			String officeLocation;
			
			public Company(String name, String mobilenumber, String address, String projectCode, String projectName,
					String projectSkill, String companyName, String officeLocation) {
				super(name, mobilenumber, address, projectCode, projectName, projectSkill);
				this.companyName = companyName;
				this.officeLocation = officeLocation;
			}
			
			
			public String getCompanyName() {
				return companyName;
			}


			public String getOfficeLocation() {
				return officeLocation;
			}
		}

			public class TestInheritanceDemo
			{
				
				public static void main(String[] args)
				{
					Company wipro=new 
					Company ("A","7066730270","pune","web008","Web project","Spring and Aws","wipro limited","Banglore"); 
					
					String pname= wipro.getCompanyName();
					String paddress=wipro.getAddress();
					String mobileNumber=wipro.getMobilenumber();
					String pProjectCode=wipro.getProjectCode();
					String pProjectName=wipro.getProjectName();
					String pProjectSkill=wipro.getProjectSkill();
					String pcompanyName=wipro.getCompanyName();
					String pofficeLocation=wipro.getOfficeLocation();
					   
				    System.out.println(pname+" "+paddress+" "+mobileNumber);
					System.out.println(pProjectCode+" "+pProjectName+" "+pProjectSkill);
					System.out.println(pcompanyName+" "+pofficeLocation);
							
						
				}
		}
		
	
	

