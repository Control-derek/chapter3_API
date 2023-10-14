import java.util.ArrayList;
import java.util.Scanner;

public class DifferentSet {

    public static void main(String[] args) {
        ArrayList<Integer> ASet = new ArrayList<Integer>();
        ArrayList<Integer> BSet = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int elemA = sc.nextInt();
        while (elemA != -1) {
            ASet.add(elemA);
            elemA = sc.nextInt();
        }
        int elemB = sc.nextInt();
        while (elemB != -1) {
            BSet.add(elemB);
            elemB = sc.nextInt();
        }
//        ArrayList<Integer> CSet = (ArrayList<Integer>) ASet.clone();
        ASet.removeAll(BSet);
        for (int e: ASet) {
            System.out.print(e+" ");
        }

    }
}
