
import java.util.*;
public class Closest2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1, 4, 5, 7,10, 20, 32, 40};
        int target=32;
        Arrays.sort(arr);
        System.out.println(closest(arr,target));
    }

    public static int closest(int arr[], int target)
    {  int n=arr.length;
        int i=0,j=n-1;
        int min=Integer.MAX_VALUE;
        int value=0;
        int sum=arr[i]+arr[j];
        while(i<j)
        {
            sum=arr[i]+arr[j];
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
            }return value;
        }



    }
