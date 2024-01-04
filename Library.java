public class Library {
    public String libraryName;
    public Book book1;
    public Book book2;
    public Book book3;
    public void addBook(Book book, int slot){
        if (slot == 1){
            book1 = book;
        }else if (slot == 2){
            book2 = book;
        }else{
            book3 = book;
        }
    }
    public void removeBook(int slot) {
        if (slot == 1){
            book1 = null;
        }else if (slot == 2){
            book2 = null;
        }else{
            book3 = null;
        }
    }
    public void printLibraryDetails() {
        System.out.println("Library: "+libraryName);
        System.out.println("");
        if (book1 != null){
            book1.printDetails();
        }else{
            System.out.println("No book in this slot.");
        }
        System.out.println("");
        if (book2 != null){
            book2.printDetails();
        }else{
            System.out.println("No book in this slot.");
        }
        System.out.println("");
        if (book3 != null){
            book3.printDetails();
        }else{
        System.out.println("No book in this slot.");
        }
    }
    public void checkBookAvailability(int slot) {
        if (slot == 1){
            if (book1 != null){
                System.out.println(book1.title+" is available.");
            }else{
                System.out.println("Book in slot "+slot+" is not available.");
            }
        }else if (slot == 2){
            if (book2 != null){
                System.out.println(book2.title+" is available.");
            }else{
                System.out.println("Book in slot "+slot+" is not available.");
            }
        }else if (slot == 3){
            if (book3 != null){
                System.out.println(book3.title+" is available.");
            }else{
                System.out.println("Book in slot "+slot+" is not available.");
            }
        }
    }
    public void updateBookPrice(int slot, double newPrice){
        if (slot == 1){
            if (book1 != null){
                book1.updatePrice(newPrice);
                System.out.println("Updated price of "+book1.title+" to $"+newPrice);
            }else{
                System.out.println("No book in this slot.");
            }
        }else if (slot == 2){
            if (book2 != null){
                book2.updatePrice(newPrice);
                System.out.println("Updated price of "+book2.title+" to $"+newPrice);
            }else{
                System.out.println("No book in this slot.");
            }
        }else if (slot == 3){
            if (book3 != null){
                book3.updatePrice(newPrice);
                System.out.println("Updated price of "+book3.title+" to $"+newPrice+".");
            }else{
                System.out.println("No book in this slot.");
            }
        }
    }
    public void printBookDetails(Book book){
        if (book != null){
            book.printDetails();
        }else{
            System.out.println("No book in this slot.");
        }
    }
}
