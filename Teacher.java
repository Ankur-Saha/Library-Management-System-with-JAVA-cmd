public class Teacher extends Patron{
	
	private String teacherId;

	public Teacher(int id, String teacherId, String name, String departmentName, String email, String contactNo, String address,double amount){
		super(id, name, departmentName, email, contactNo, address, amount);
		this.teacherId=teacherId;
	}

	public void setTeacherId(String teacherId){
		this.teacherId=teacherId;
	}

	public String getTeacherId(){
		return teacherId;
	}

	public void showInfo(){
		System.out.println("Teacher Name:"+getName());
		System.out.println("Teacher ID: "+getTeacherId());
		System.out.println("Department: "+getDepartmentName());
		System.out.println("Email: "+getEmail());
		System.out.println("Contact No: "+getContactNo());
		System.out.println("Address: "+getAddress());
		System.out.println("Fined Amount: "+getAmount());	
	}

}