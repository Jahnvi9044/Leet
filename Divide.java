public class Divide {

    public static void main(String[] args) {
        System.out.println(divide(2147483647,1));
    }
        public static int divide(int dividend, int divisor) {
            long Dividend=dividend;
            long Divisor=divisor;
            long count=0;
            int b=0,c=0;
            if(Dividend<0)
            {
                Dividend*=-1;
                b=1;

            }

            if(Divisor<0)
            {
                Divisor*=-1;
                c=1;
            }
            // System.out.println(Dividend+" "+Divisor);
            // System.out.println(b+" "+c);
            long l=2147483648L;
            while(Dividend>=Divisor)
            {
                Dividend-=Divisor;
                count++;
             //   if(count>=l)
                //    break;
            }
            // System.out.println(count);
            if(b==1)
                count*=-1;
            if(c==1)
                count*=-1;
            if(count<-2147483648)
                count=-2147483648;
            if(count>2147483647)
                count=2147483647;
          //  int vf=(int)count;

            return (int)count;
        }}


