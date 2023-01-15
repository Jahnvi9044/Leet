
import java.util.*;
public class ArrayBarChart {
    public static void main(String[] args) {
        Scanner sc=new Scanner( System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i] =sc.nextInt();
        //Calculating MAX
        int max=arr[0];
        for(int i=0;i<n;i++)
            if(arr[i]>max)
                max=arr[i];
        //Build the floors
        for(int i=max;i>=1;i--) {
            System.out.print(i + ". ");
            for (int j = 0; j < n; j++) {
                if (i <= arr[j]) System.out.print("* ");

                else System.out.print("  ");

            }
            System.out.println();
        }
        System.out.print("   ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }




    }
}
