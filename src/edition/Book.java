package edition;

import printable.Printable;

public class Book implements Printable {
    public String title;
    public Book(String title){
        this.title = title;
    }
    @Override
    public void print() {
        System.out.println("The title of this book is " + this.title);
    }
    public static void printBooks(Printable[] printable){
        for(Printable edition : printable){
            if(edition instanceof Book){
                System.out.println(((Book) edition).title);
            }
        }
    }
}
