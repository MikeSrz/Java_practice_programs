
public class UseBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book myBook = new Book("Asleep in Armageddon", "Ray Bradbury", "Planet Stories", 1948, "A222A", 17, 10.2f,200);
		Book defaultBook = new Book();
		System.out.println("Mi Libro: ");
		System.out.printf(myBook.showInfo());
		System.out.println("Libro Default: ");
		System.out.printf(defaultBook.showInfo());
	}

}
