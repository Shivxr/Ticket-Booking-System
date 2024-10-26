import java.util.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws Exception{
        int z=0;
        Book obj1=new Book();
        Avail obj2=new Avail();
        Check obj3=new Check();
        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.println();
            System.out.println("What do you want to do ? ");
            System.out.println("Book Tickets : 1 ");
            System.out.println("Available Tickets : 2 ");
            System.out.println("Statement : 3");
            System.out.println("Exit : 4 ");
            int inp = sc.nextInt();
            if (inp == 1) {
                obj2.avail();
                z = obj1.book();
            } else if (inp == 2) {
                obj2.avail();
            } else if (inp == 3) {
                obj3.check(z);
            } else {
                System.out.println("Thank You");
                System.exit(0);
            }
        }


    }
}
