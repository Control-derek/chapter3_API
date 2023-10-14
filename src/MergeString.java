import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MergeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        StringBuffer str1 = new StringBuffer(s1);
        StringBuffer str2 = new StringBuffer(s2);
        str1.append(str2);
        char[] str = str1.toString().toCharArray();
        Arrays.sort(str);
        for (char c: str) {
            System.out.print(c);
        }
    }
}