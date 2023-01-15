//this program determines the longest substring without repeating characters

import java.util.*;
public class LongestSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int i = 1;

        String str = "" + st.charAt(0);
        String max = "";
        int m = 0;
        String ch = "" + st.charAt(i);
        while (i < st.length()) {
            ch = "" + st.charAt(i);
            if (str.contains(ch)) {
                if (max.length() < str.length()) {
                    max = str;
                   System.out.println(str);
                    int k = st.indexOf(ch, m);
                    System.out.println(k);
                    m = k;
                    str = st.substring(k + 1, i);
                    str += st.charAt(i);
                    i++;

                }
            } else {
                str += st.charAt(i);

                i++;
            }


        }

        System.out.println("is out");
        if (str.contains(ch)) {
            System.out.println("true");
            if (max.length() < str.length()) {
                max = str;
               // System.out.println(str);
                int k = st.indexOf(ch, m);
                System.out.println(m);
                m = k;
                str = st.substring(k + 1, i);

                i++;}}
        if (max.length() < str.length()) {
            max = str;

        }
                System.out.println("max = " + max);
            }
        }
