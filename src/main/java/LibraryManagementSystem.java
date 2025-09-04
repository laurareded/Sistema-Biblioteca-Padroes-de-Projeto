public class LibraryManagementSystem {
    public static void main(String[] args) {

        System.out.println("--- Gerenciando Livro ---");
        Book book = new Book("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, "Fantasia");
        book.displayInfo(); 
        book.readSample();  
        book.borrow();       
        book.returnItem();   

        System.out.println("\n--- Gerenciando Revista ---");
        Magazine magazine = new Magazine("National Geographic", "Vários", 2023, 157);
        magazine.displayInfo(); 
        magazine.flipPages();   
        magazine.borrow();      
        magazine.returnItem();  

        System.out.println("\n--- Gerenciando Mídia Digital ---");
        DigitalMedia digitalMedia = new DigitalMedia("Curso de Java", "Professor X", 2024, "MP4");
        digitalMedia.displayInfo(); 
        digitalMedia.play();        
        digitalMedia.borrow();      
        digitalMedia.returnItem();  
    }
}