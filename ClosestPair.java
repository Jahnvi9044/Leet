
import java.util.*;
public class ClosestPair {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a={1, 4, 5, 7};

        int[] a1={10, 20, 32, 40};
        int x=32;
        closestpair(a,a1,x);


    }
    public static void closestpair(int[] a,int[] b,int x)
    {
        //first we need to merge the two arrays
        int n=a.length;
        int m=b.length;
        int i=0,j=0,k=0;
        int[] a3=new int[n+m];
        while(i<n && j<m)
        {
            if(a[i]<b[j])
                a3[k++]=a[i++];
            else if(a[i]>b[j])
                a3[k++]=b[j++];
            else if(a[i]==b[j])
            {
                a3[k++] = b[j++];

                a3[k++]=a[i++];


            }


        }

        while(i<n)
        a3[k++]=a[i++];

        while(j<m)
            a3[k++]=b[j++];

        for(int p=0;p<a3.length;p++)
        {
            System.out.print(a3[p]+" ");

        }
        //Array merged

        i=0;
        j=a3.length-1;
        int sum=0,min=x;
        int p=0,q=0;
        while(i<j)
        {
            sum=a3[i]+a3[j];
            if(Math.abs(sum-x)<min)
            {  min=Math.abs(sum-x);
                p=i;
                q=j;}


              if(sum>x)
                j--;
            else i++;


        }
        System.out.println();
        System.out.println(a3[p]+" "+a3[q]);



    }
}
