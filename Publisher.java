public class Publisher
{
	private int pid;
	private String pname;
	private String contactNo;

	public Publisher (int pid, String pname, String contactNo){
		this.pid = pid;
		this.pname = pname;
		this.contactNo = contactNo;
	}

	public void setId (int pid){
		this.pid = pid;
	}
	public void setName (String pname){
		this.pname = pname;
	}
	public void setContactNo (String contactNo){
		this.contactNo = contactNo;
	}


	public int getId (){
		return pid;
	}
	public String getName (){
		return pname;
	}
	public String getContactNo (){
		return contactNo;
	}

	public void showInfo(){
		System.out.println("Publisher ID: "+getId());
		System.out.println("Publisher Name: "+getName());
		System.out.println("Publisher Contact No: "+getContactNo());
	}
}