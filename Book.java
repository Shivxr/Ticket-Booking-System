import java.util.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

public class Book extends Avail  {
    public List<Integer> tl=new ArrayList<>();
    public Book() throws Exception{
        super();
        this.c=avail();
    }

    public int book() throws Exception {
        int f=0;
        String op="";
        String bs="";
        Scanner sc = new Scanner(System.in);
        int ln = arr.length;
        int tc = 0;
        pth=Paths.get("Seats.txt");
        String s=new String(Files.readAllBytes(pth));
        arr=s.split(" ");
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("0")){
                l.add(i+1);
                st.add(i+1);
            }
            else{
                continue;
            }
        }


        label1:
        while (true) {

            if (c == 0) {
                System.out.println("No seats available");
                break label1;
            }

            else {
                System.out.println("Enter the number of Seats needed : ");
                int n = sc.nextInt();
                if (n <= c) {
                    while (tc <= n) {
                        int a = sc.nextInt();
                        if (st.contains(a)) {
                            tc += 1;
                            bs+=""+a;
                            arr[a-1]="1";
                            tl.add(a);
                            l.remove(a);
                        }
                        else{
                            System.out.println("Enter Correct Seat");
                            System.out.println(l);
                        }
                    if(tc==n){
                        System.out.println("Tickets are booked");
                        f=1;
                        break label1;
                    }
                    }
                }
                else{
                    System.out.println("Insufficient Seats");
                    break label1;
                }
            }
        }
        if(f==1){
            for(String ch:arr){
                op+=ch+" ";
            }
        Files.write(pth,op.getBytes());
        }
        return tc;
    }
}
