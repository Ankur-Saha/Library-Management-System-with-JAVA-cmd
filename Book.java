public class Book{

	private int id;
	private String title;
	private String subtitle;
	private Author author;
	private Publisher publisher;
	private int noOfCopy;
	private double price;

	Book books[]=new Book[10];

	public Book (int id, String title, String subtitle,Author author, Publisher publisher,int noOfCopy, double price){
		this.id=id;
		this.title=title;
		this.subtitle=subtitle;
		this.author = author;
		this.publisher = publisher;
		this.noOfCopy = noOfCopy;
		this.price=price;
	}


	public void setId(int id){
		this.id=id;
	} 
	public void setTitle(String title){
		this.title=title;
	}
	public void setSubtitle(String subtitle){
		this.subtitle=subtitle;
	}
	public void setAuthor(Author author){
		this.author=author;
	}
	public void setPublisher(Publisher publisher){
		this.publisher=publisher;
	}
	public void setNoOfCopy(int noOfCopy){
		this.noOfCopy=noOfCopy;
	}
	public void setPrice(double price){
		this.price=price;
	}


	public int getId(){
		return id;
	}
	public String getTitle(){
		return title;
	}
	public String getSubtitle(){
		return subtitle;
	}
	public Author getAuthor(){
		return author;
	}
	public Publisher getPublisher(){
		return publisher;
	} 
	public int getNoOfCopy(){
		return noOfCopy;
	}
	public double getPrice(){
		return price;
	}


	public void showInfo(){
		System.out.println("Book ID: "+getId());
		System.out.println("Book Title: "+getTitle());
		System.out.println("Book Sub-Title: "+getSubtitle());
		System.out.println("---Author Details--- \nName: "+author.getName()+"\nAuthor ID: "+author.getId()+"\nAuthor Email: "+author.getEmail());
		System.out.println("---Publisher Details--- \nName: "+publisher.getName()+"\nPublisher ID: "+publisher.getId()+"\nPublisher Contact No: "+publisher.getContactNo());
		System.out.println("Book Copies: "+getNoOfCopy());
		System.out.println("Book Price: "+getPrice());
		System.out.println ("--------------------------------------------");

	} 
}
