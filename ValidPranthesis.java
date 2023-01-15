

import java.util.Stack;
import java.util.Iterator;
import java.util.Scanner;

public class ValidPranthesis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Character> stk=new Stack<>();
        Iterator iterator=stk.iterator();
       // int top=stk.peek();
        String st=sc.next();
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(ch=='('||ch=='['||ch=='{')
                stk.push(ch);

            else if(ch==')' && stk.lastElement()=='(')
                stk.pop();
            else if(ch==']' && stk.lastElement()=='[')
                stk.pop();
            else if(ch=='}' && stk.lastElement()=='{')
                stk.pop();
            else stk.push(ch);

         }
        if(stk.empty())
            System.out.println("true");
        else System.out.println("false");

    }
}
