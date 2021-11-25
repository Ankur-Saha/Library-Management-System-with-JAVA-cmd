public interface iBasicOperations{

	void borrow(Patron p, Book b);

	void ret(Patron p, Book b);

	void fine(Patron p,double amount);
}