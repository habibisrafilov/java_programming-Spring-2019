package Day_49;

public class BarnesAndNobles {
  public static void main(String[] args) {
	
	EBook ebook = new EBook();
	ebook.setTitle("Introduction to Java ");
	ebook.setAuthor("Savich");
	ebook.setPages(1016);
	ebook.setPrice(170);
	ebook.setSize(500);
	ebook.setType("Tech Book");
	
	System.out.println(ebook.getTitle());
	System.out.println(ebook.getAuthor());
	System.out.println(ebook.getType());
	System.out.println(ebook.getPrice());
    System.out.println(ebook.getPages());	
	System.out.println(ebook.getSize());
	
	ebook.readEBook(10);
	ebook.readEBook(621);
	
	AudioBook abook = new AudioBook();
	
	abook.setTitle("OCA preparation");
	abook.setAuthor("Jhon");
	abook.setNarrator("Marufjon");
	abook.listen();
	
	PaperBack pb = new PaperBack();
	pb.setAuthor("Habib");
	pb.setPages(45);
	pb.setPrice(450);
	pb.setTitle("Soccer");
	pb.setType("sport");

		
	System.out.println(pb.toString());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    }
  
  
}
