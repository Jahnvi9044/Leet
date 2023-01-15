
//I REALLY DON,T KNOW WHAT I HAVE DONE !!!!!!!!!!!!!!!!!!!
import java.util.*;
public class Array_TrapRainWater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i] =sc.nextInt();
        int[] b=new int[n];
        for(int i=n-1;i>=0;i--)
        {b[i]=a[n-1-i];

        }
        System.out.println(Math.max(trap(a),trap(b)));

    }
    public static int trap(int[] a)
    {//I REALLY DON,T KNOW WHAT I HAVE DONE !!!!!!!!!!!!!!!!!!!
        int n=a.length;
        int j=0;
        int i;
        for(i=0;i<n;i++)
        {
            if(a[i]!=0)
            {j=a[i];
                break;}

        }
        //System.out.println(j);
        int sum=0;
        int k=i+1;
        while(k<n)
        {
           if(greaterthanjexists(k,j,a))
           {  j=pos(k,j,a);
               //System.out.println("j="+j);
               while(a[k]<j)
               {
                  // System.out.println("a[k]="+a[k]);
                   sum+=j-a[k];
                   k++;
                   //System.out.println("sum="+sum);
                   //System.out.println(k);
                   if(a[k]>j)
                   { j=a[k];
                       break;}
               }
               //System.out.println("hey");
               if(a[k]>=j)
               {j=a[k];
                  // System.out.println("j="+j);
                   k++;}
           }

           else {
               j=a[k];
               k++;
             //  System.out.println("j="+j+" k="+k+" a[k]=");
             //  System.out.println("HRY");
           }
           if(k>=n)
               break;
        }

        return sum;
    }
    public static boolean  greaterthanjexists(int k,int j,int[] a)
    {   for(int i=k;i<a.length;i++)
    {
        if(a[i]>=j)
            return true;
    }
        return false;
    }
    public static int pos(int k,int j,int[] a)
    {for(int i=k;i<a.length;i++)
    {
        if(a[i]>=j)
            return Math.min(a[i],j);
    }
    return 0;

    }
}
