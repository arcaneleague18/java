import java.util.Scanner;

class Book {
    String title;  // package-private access
    String author; // package-private access
    
    // Constructor
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    // Method to check if two books are equal
    boolean isEqual(Book other) {
        if (other == null) return false;
        return this.title.equals(other.title) && this.author.equals(other.author);
    }
    
    // Method to display book details
    void display() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

public class ObjectEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter details for Book 1:");
        System.out.print("Title: ");
        String title1 = scanner.nextLine();
        System.out.print("Author: ");
        String author1 = scanner.nextLine();
        
        System.out.println("Enter details for Book 2:");
        System.out.print("Title: ");
        String title2 = scanner.nextLine();
        System.out.print("Author: ");
        String author2 = scanner.nextLine();
        
        // Create book objects
        Book book1 = new Book(title1, author1);
        Book book2 = new Book(title2, author2);
        
        // Display details
        System.out.println("\nBook 1:");
        book1.display();
        System.out.println("Book 2:");
        book2.display();
        
        // Check equality
        System.out.println("Books are " + (book1.isEqual(book2) ? "equal" : "not equal"));
        
        scanner.close();
    }
}
