
public abstract class Patron implements iBasicOperations{

	private int id;
	private String name;
	private String departmentName; 
	private String email;
	private String contactNo;
	private String address;
	private double amount;

	public Patron(int id,String name, String departmentName, String email, String contactNo, String address,double amount){
		this.id=id;
		this.name=name;
		this.departmentName=departmentName;
		this.email=email;
		this.contactNo=contactNo;
		this.address=address;
		this.amount=amount;
	}

	public void setId(int id){
		this.id=id;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setDepartmentName(String departmentName){
		this.departmentName=departmentName;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public void setContactNo(String contactNo){
		this.contactNo=contactNo;
	}
	public void setAddress(String address){
		this.address=address;
	}
	public void setAmount(double amount){
		this.amount=amount;
	}


	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public String getDepartmentName(){
		return departmentName;
	}
	public String getEmail(){
		return email;
	}
	public String getContactNo(){
		return contactNo;
	}
	public String getAddress(){
		return address;
	}
	public double getAmount(){
		return amount;
	}


	public abstract void showInfo();

	
	public void borrow(Patron p, Book b){
		System.out.println (" ");
		System.out.println ("---Borrow Details--- ");
		System.out.println("Name:"+p.getName());
		System.out.println("Borrowed Books:"+b.getTitle());
		System.out.println (" ");
	}
	public void ret(Patron p, Book b){
		System.out.println (" ");
		System.out.println ("---Return Details--- ");
		System.out.println("Name:"+p.getName());
		System.out.println("Returned Books:"+b.getTitle());
	}
	public void fine(Patron p,double amount){
		System.out.println (" ");
		System.out.println ("---Fine Details--- ");
		p.setAmount(amount);
		System.out.println("Name:"+p.getName());		
		System.out.println("Fined Amount:"+p.getAmount());
	}
}



