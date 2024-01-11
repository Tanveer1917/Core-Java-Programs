package inheritance1;

public class Hosteller extends Student
{
	private String HostelName;
	private String HostelNumber;
	
	public String getHostelName() {
		return HostelName;
	}
	public void setHostelName(String hostelName) {
		HostelName = hostelName;
	}
	public String getHostelNumber() {
		return HostelNumber;
	}
	public void setHostelNumber(String hostelNumber) {
		HostelNumber = hostelNumber;
	}
	@Override
	public String toString() {
		return "Hosteller [HostelName=" + HostelName + ", HostelNumber=" + HostelNumber + "]";
	}
	

}
