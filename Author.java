public class Author
{
	private int aid;
	private String aname;
	private String email;

	public Author (int aid, String aname, String email){
		this.aid = aid;
		this.aname = aname;
		this.email = email;
	}
	
	public void setId (int aid){
		this.aid = aid;
	}
	public void setName (String aname){
		this.aname = aname;
	}
	public void setEmail (String email){
		this.email = email;
	}


	public int getId (){
		return aid;
	}
	public String getName (){
		return aname;
	}
	public String getEmail (){
		return email;
	}
	public void showInfo(){
		System.out.println("Author ID: "+getId());
		System.out.println("Author Name: "+getName());
		System.out.println("Author Email: "+getEmail());
	}
}