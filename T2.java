import java.util.ArrayList;

public class T2 {
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<String>();
        a.add("abdu");
        a.add("hasan");
        a.add("osama");
        a.add("ali");
        for (int i = 0; i < a.size(); i++) {
            a.remove(i);
        }
        System.out.println(a);

    }
}
