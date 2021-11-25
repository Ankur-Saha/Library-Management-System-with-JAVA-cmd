public class BookOperations{
	Book books[]=new Book[20];
	public void insertBook (Book [] b){
		for (int i=0;i<20;i++){
			books[i]=b[i];
		}
	}
	public void removeBook (int b){
		int n=b-1;
		for (int i=n;i<15;i++){
			books[i]=books[i+1];
		}
	}
	public void getBook (int bookID){
		books[bookID-1].showInfo();
	}
	public void showAllBooks (){
		for (int i=0;i<20;i++){
			books[i].showInfo();
			System.out.println(" ");
		}
	}	
}