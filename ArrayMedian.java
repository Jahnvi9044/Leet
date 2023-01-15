
import java.util.*;
public class ArrayMedian {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={1};
        int a1[]={};
       // System.out.println(a1.length);
        findMedianSortedArrays(a,a1);


    }

        public static double findMedianSortedArrays(int[] nums1, int[] nums2)
        {int n=nums1.length;
            int m=nums2.length;
            int l=m+n;
            System.out.println(n+" "+m);
            int[] a=new int[n+m];
            int i=0,j=0,k=0;
            while(i<n && j<m)
            {
                if(nums1[i]<nums2[j])
                a[k++]=nums1[i++];

                 else if(nums1[i]>nums2[j])
                a[k++]=nums2[j++];

                else  if(nums1[i]==nums2[j])
                {a[k++]=nums2[j++];

                    a[k++]=nums1[i++];

                }}
                while(i<n && j==m)
                {System.out.println(j+" "+m);
                    a[k++]=nums1[i++];

                }
                System.out.println(j+" "+m);
                while(j<m && i==n)
                {
                    a[k++]=nums2[j++];


                }



            System.out.println("array is");
            for(int g=0;g<l;g++)
                System.out.print(a[g]+" ");
            System.out.println();
            double med=0;

            if(l%2==1)
            {l--;
                med=a[(l+1)/2];
                 System.out.println((l+1)/2);

            }
            else
            {l--;
                med=(double)(a[l/2]+a[l/2+1])/2;
            }
            return med;



        }
    }

