import java.util.Arrays;
import java.util.*;

public class ClosestSum4 {


//REMOVE THE COMMENTS YOU WILL SEE THE ERROR

//Here we have to find the closest by summing 3 element
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,0,-1,0,-2,2};
        int target=0;
        Arrays.sort(arr);
       // System.out.println(closest(arr,target));
    }

   /* public static List<List<Integer>> closest(int[] arr, int target) {
    {  int n=arr.length;
        int value=0;
        List<List<Integer>> list
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
                else if(sum==target)
                {;
                    value=sum;}
            }//closing while


        }//closing for
        return value;}
*/



}
