import java.util.Arrays;
import java.util.Scanner;

public class SegString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String tok = sc.nextLine();
        char [] s = str.toCharArray();
        int index=0, preindex=0;
        for (char c: s) {
            if (tok.indexOf(c) != -1) {  // 分割符
                if (index != preindex)
                    System.out.println(str.substring(index, preindex));
                index = preindex + 1;
            }
            preindex++;
        }
        System.out.println(str.substring(index, preindex));
    }
}
