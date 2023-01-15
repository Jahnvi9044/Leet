import java.util.Scanner;
public class ArraysSumOfNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner( System.in);
        int n=sc.nextInt();

        int[] arr1=new int[n];
        for(int i=0;i<n;i++)
            arr1[i] =sc.nextInt();

        int m=sc.nextInt();
        int[] arr2 =new int[m];
        for(int j=0;j<m;j++)
            arr2[j]=sc.nextInt();

        int carry=0;



        int[] arr=new int[n>m?n:m];
        int sum;
        int k=arr.length-1;
        int i=n-1,j=m-1;

        while(i>=0 && j>=0)
        {   sum=arr1[i--]+arr2[j--]+carry;
           // System.out.print(sum+"  ");
            arr[k--]=sum%10;
            //System.out.println(arr[k+1]);
            carry=sum/10;

        }

        while(i>=0)
        {
            sum=arr1[i--]+carry;
            arr[k--]=sum%10;
            carry=sum/10;

        }
        while(j>=0)
        {
            sum=arr2[j--]+carry;
            arr[k--]=sum%10;
            carry=sum/10;

        }


       if(carry!=0) System.out.print(carry);

        for(int p=0;p<arr.length;p++)
           System.out.print(arr[p]);


        }
}
