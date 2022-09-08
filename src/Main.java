import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.err.println("Hello world!");
        Random rd = new Random();
        int [] ar = new int[10];
        ArrayList<Integer> a = new ArrayList<>();
        LinkedList<Integer> b = new LinkedList<>();

        for (int i = 0; i < ar.length; i++) {
            ar[i]= rd.nextInt(2);
            a.add(i,rd.nextInt(2));
            b.add(i,rd.nextInt(2));
        }
        System.out.println((char) 27 + "[33mBefore sort:" + (char)27 + "[0m"+Arrays.toString(ar));
        sort(ar);
        System.out.println((char) 27 + "[35m------------------- " + (char)27 + "[0m");
        System.out.println((char) 27 + "[32m\nBefore sort:" + (char)27 + "[0m"+a);
        sort(a);
        System.out.println((char) 27 + "[30m------------------- " + (char)27 + "[0m");
        System.out.println((char) 27 + "[31m\nBefore sort:" + (char)27 + "[0m"+b);
        sort(b);
        System.out.println((char) 27 + "[36m------------------- " + (char)27 + "[0m");
    }
    public static void sort(int[] ar){
        Arrays.sort(ar);
        System.out.println((char) 27 + "[35mSorted array: " + (char)27 + "[0m"+Arrays.toString(ar));
    }

    public static void sort(ArrayList<Integer> a){
        Collections.sort(a);
        System.out.println((char) 27 + "[30mSorted Araylist: " + (char)27 + "[0m" +a);
    }

    public  static  void sort(LinkedList<Integer> b){
        Collections.sort(b);
        System.out.println((char) 27 + "[36mSorted Linkedlist: " + (char)27 + "[0m" +b);
    }
}
