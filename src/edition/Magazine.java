package edition;
import printable.Printable;
public class Magazine implements Printable {
    public String title;
    public Magazine(String title){
        this.title = title;
    }
    @Override
    public void print() {
        System.out.println("The title of this magazine is " + this.title);
    }
    public static void printMagazines(Printable[] printable){
        for(Printable edition : printable){
            if(edition instanceof Magazine){
                System.out.println(((Magazine) edition).title);
            }
        }
    }

}

