import java.util.Scanner;

public class ArrayDifferenceOfNo {

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

            int k=arr.length-1;
            int i=n-1,j=m-1;

            while(i>=0 && j>=0)
            {   if((arr[i]+carry)<arr2[j])
                {
                arr1[i]+=10+carry;
                arr[k]=arr1[i]-arr2[j];
                    //System.out.println(arr[k]);
                carry=-1;
                }
                else if((arr1[i]+carry)>arr2[j])
               {

                   arr[k]=arr1[i]+carry-arr2[j];
                  // System.out.println(arr[k]);
                   carry=0;
               }
                k--;
                i--;
                j--;
            }


            while(i>=0)
            { if((arr1[i]+carry)<0)
              {
                arr1[i]+=10+carry;
                arr[k]=arr1[i];

                carry=-1;
                 // System.out.println(i+" "+arr[k]+" "+carry);
              }

            else if((arr1[i]+carry)>=0)
             {

                arr[k]=arr1[i]+carry;

                carry=0;
                // System.out.println(i+" "+arr[k]+" "+carry);
             }
            i--;
            k--;

            }



            if(arr[0]!=0)
                System.out.print(arr[0]);

            for(int p=1;p<arr.length;p++)
            {


                System.out.print(arr[p]);
            }


        }
    }


