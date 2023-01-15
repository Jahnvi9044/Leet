



public class StringZigZag {
    public static void main(String[] args) {

        String st ="PALPALISHIRING";
        System.out.println(convert(st,3));



    }
    public static String convert(String st, int numRows)
  {
        String str="";
        int s1,s2,n=st.length();
        if(n<=numRows)return st;
        for(int i=0;i<numRows;i++)
        {
            s1=(numRows-i)*2-2;
            s2=(numRows-(numRows-i-1))*2-2;
            int j=i;

            str=str+st.charAt(j);
            while(true)//j<n
            {

                if(s1!=0)
                { j+=s1;
                    if(j>n-1)
                        break;
                    str+=st.charAt(j);}

                if(s2!=0)
                { j+=s2;
                    if(j>n-1)
                        break;
                    str+=st.charAt(j);}

            }
        }

       return str;
    }
}
