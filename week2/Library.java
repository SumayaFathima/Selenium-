package HomeAssignments.week2;

public class Library {
	
	public String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;
	}
	
	public void issueBook() {
		System.out.println("Book issued successfully");
	}

	public static void main(String[] args) {
		
		Library lib = new Library();
		String title = lib.addBook("Harry Potter");
		System.out.println("Book Title :" + title);
		lib.issueBook();
	}
}