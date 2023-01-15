
import java.util.*;
public class WaterLevel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(a));

    }
    public static  int maxArea(int[] a)
    {int n=a.length;
        int area=0;
        int Marea=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            { area=(j-i)*Math.min(a[i],a[j]);

                if(area>Marea)
                    Marea=area;

            }

        }
        return Marea;

    }
}
