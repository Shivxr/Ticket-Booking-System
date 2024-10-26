import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.*;
public class Avail {
    protected String[] arr;
    public List<Integer> l=new ArrayList<>();
    public HashSet<Integer> st=new HashSet<>();
    public Path pth;
    public int c;
    public int avail() throws Exception {
        c=0;
        pth=Paths.get("Seats.txt");
        String s=new String(Files.readAllBytes(pth));
        arr=s.split(" ");
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("0")){
                l.add(i+1);
                st.add(i+1);
                c+=1;
            }
            else{
                continue;
            }
        }

        System.out.println("The Available Seats are : ");
        System.out.print(st);
        System.out.println();

        return c;
    }
}
