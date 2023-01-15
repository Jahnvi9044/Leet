
import java.util.*;
public class ConatinsFunctionstring {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s="abc";
        String st2=s.substring(0,1);
        if(s.contains(st2))
            System.out.println(true+" "+st2);
        else System.out.println(false);


    }
}
