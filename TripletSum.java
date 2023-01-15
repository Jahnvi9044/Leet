
import java.util.*;
public class TripletSum {
    public static void main(String[] args)
    {
        Scanner sc=new  Scanner(System.in);
        int[] a={1,0,1,2,-1,-4};
        int x=2;
        Arrays.sort(a);
        tripletSum(a,x);


    }
    public static void tripletSum(int[] a,int x)
    { int n=a.length;
        int i,j=n-1;
        int sum=0;
        boolean b=true;
        for(int k=0;k<n-2;k++)
        {i=k+1;
           j=n-1;
            while(i<j)
            {  sum=a[k]+a[i]+a[j];
                if(sum>x)
                    j--;
                else if(sum<x)
                    i++;
                else if(sum==x)
                {b=false;
                    System.out.println(a[k] + " " + a[i] + " " + a[j]);
                    j--;
                }


            }
        }
        if(b)
            System.out.println(!b);

    }
}
