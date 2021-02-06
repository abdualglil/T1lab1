public class T1 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] b=new int[5];

        for (int i=0;i<a.length;i++){
            b[4-i]=a[i];
        }
        for (int i = 0; i < 5; i++) {
            a[i]=b[i];
        }
        for (int i = 0; i <5; i++) {
            System.out.println(a[i]);
        }

}}
