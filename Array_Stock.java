


public class Array_Stock {
    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        System.out.println(Cal_profit(arr));
    }

    public static int Cal_profit(int[] arr)
    {  int maxIn=0,minIn=0,max=arr[0],min=arr[0];
        int profit=0;
        for(int i=0;i<arr.length;i++)
        { if(min>arr[i])
            {
                minIn=i;
                min=arr[i];
            }
            if(max<arr[i])
            {
                maxIn=i;
                max=arr[i];
            }
            if(maxIn>minIn)
            {
                int diff=max-min;
                if(profit<diff)
                    profit=diff;
            }
            if(maxIn>minIn) {
                max = 0;
                maxIn=-1;
            }
        }
       return profit;
    }
}
