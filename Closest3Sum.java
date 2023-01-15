
//Here we have to find the closest by summing 3 elements
import java.util.*;
public class Closest3Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={-1,2,1,-4};
        int target=1;
        Arrays.sort(arr);
        System.out.println(closest(arr,target));
    }

    public static int closest(int arr[], int target)
    {  int n=arr.length;
        int value=0;
        int min=Integer.MAX_VALUE;
        int sum=0;
        for(int k=0;k<n-2;k++)
        {
        int i=k+1,j=n-1;



        while(i<j)
        {
            sum=arr[i]+arr[j]+arr[k];
            if(sum>target)
            {
                j--;

            }
            else if(sum<target)
            {
                i++;

            }
            if(min>Math.abs(sum-target))
            {min=Math.abs(sum-target);
                value=sum;}
        }//closing while


        }//closing for
        return value;}




}
