import java.util.Scanner;

class Book {
    protected String title;
    protected String author;
    protected double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}

class Fiction extends Book {
    public Fiction(String title, String author, double price) {
        super(title, author, price);
    }

    public void displayDetails() {
        System.out.println("Fiction Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

class NonFiction extends Book {
    public NonFiction(String title, String author, double price) {
        super(title, author, price);
    }

    public void displayDetails() {
        System.out.println("Non-Fiction Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

class LibraryManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Fiction Book Title: ");
        String fictionTitle = scanner.nextLine();
        System.out.print("Enter Fiction Book Author: ");
        String fictionAuthor = scanner.nextLine();
        System.out.print("Enter Fiction Book Price: ");
        double fictionPrice = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter Non-Fiction Book Title: ");
        String nonFictionTitle = scanner.nextLine();
        System.out.print("Enter Non-Fiction Book Author: ");
        String nonFictionAuthor = scanner.nextLine();
        System.out.print("Enter Non-Fiction Book Price: ");
        double nonFictionPrice = scanner.nextDouble();

        Fiction fictionBook = new Fiction(fictionTitle, fictionAuthor, fictionPrice);
        NonFiction nonFictionBook = new NonFiction(nonFictionTitle, nonFictionAuthor, nonFictionPrice);
        
        fictionBook.displayDetails();
        System.out.println();
        nonFictionBook.displayDetails();
        scanner.close();
    }
}
