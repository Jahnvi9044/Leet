public class flowerbed {

    public static void main(String[] args) {
        int flowerbed[]={1,0,0,0,1};
        int n=1;
        System.out.println(canPlaceFlowers( flowerbed,  n));

    }
        public static boolean canPlaceFlowers(int[] flowerbed, int n) {

            int[] a=flowerbed;
            int copy=0,count=0;
            if(a[0]==0&& a[1]==0)
                copy++;
            for(int i=1;i<a.length-1;i++)
            {count=0;
                while(a[i]==0)
                {
                    count++;
                    i++;

                }
                System.out.println(count);
                if(count>=3)
                {
                    copy=(count+1)/3;
                }
            }
            if(a[n-1]==0&&a[n-2]==0)
                copy++;

            return copy>=n;
        }
    }

