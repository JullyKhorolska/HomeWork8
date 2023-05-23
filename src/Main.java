import printable.Printable;
import edition.Book;
import edition.Magazine;

public class Main {
    public static void main(String[] args) {

        Printable[] printable = {
                new Book("bookOne"),
                new Book("bookTwo"),
                new Magazine("magazineOne"),
                new Magazine("magazineTwo"),
                new Book("bookThree") };

        for( Printable edition : printable){
            edition.print();
        }
        System.out.println("-----------------------------");

        Book.printBooks(printable);
        System.out.println("-----------------------------");
        Magazine.printMagazines(printable);
    }
}