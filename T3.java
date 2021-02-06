import java.util.ArrayList;
import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<>();
        Scanner in =new Scanner(System.in);


            System.out.print("enter =");
            String s=in.next();
            a.add(s);
            System.out.print("remowv =");
            int b=in.nextInt();
            a.remove(b);
            System.out.println(a);



    }
}
