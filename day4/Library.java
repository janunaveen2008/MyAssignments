package week1.day4;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lib= new Library();
		lib.addBook("Selenium Testing");
		lib.issueBook();
	}
	
	public String addBook(String bookTitle) {
		System.out.println("Book Title to be add is : "+bookTitle);
		System.out.println("Book added sucessfully");
		return bookTitle;
	}
	public void issueBook() {
		System.out.println("Book issued sucessfully");

	}

}
