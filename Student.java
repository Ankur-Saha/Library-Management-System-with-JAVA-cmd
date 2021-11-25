public class Student extends Patron{
	private String studentId;
	private String guardianName;
	private String guardianContactNo;

	public Student(int id, String studentId, String name, String departmentName, String email, String contactNo, String address, String guardianName, String guardianContactNo, double amount){
		super(id, name, departmentName, email, contactNo, address, amount);
		this.studentId=studentId;
		this.guardianName=guardianName;
		this.guardianContactNo=guardianContactNo;
	}


	public void setStudentId(String studentId){
		this.studentId=studentId;
	}
	public void setGuardianName(String guardianName){
		this.guardianName=guardianName;
	}
	public void setGuardianContactNo(String guardianContactNo){
		this.guardianContactNo=guardianContactNo;
	}

	public String getStudentId(){
		return studentId;
	}
	public String getGuardianName(){
		return guardianName;
	}
	public String getGuardianContactNo(){
		return guardianContactNo;
	}

	public void showInfo(){
		System.out.println("Student ID: "+getStudentId());
		System.out.println("Student Name:"+getName());
		System.out.println("Guardian Name: "+getGuardianName());
		System.out.println("Guardian Contact No: "+getGuardianContactNo());
		System.out.println("Department Name: "+getDepartmentName());
		System.out.println("Email: "+getEmail());
		System.out.println("Contact No: "+getContactNo());
		System.out.println("Address: "+getAddress());
		System.out.println("Fined Amount: "+getAmount());	
	}
}
