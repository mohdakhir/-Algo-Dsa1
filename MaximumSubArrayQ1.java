import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class MaximumSubArrayQ1
{
    public static void main(String[] args)
     {
       // int ar[]={2,3,5,2,9,7,1};
       Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int ar[]=new int[n];
         for(int i=0;i<ar.length;i++)
         {
             ar[i]=sc.nextInt();
         }
        int k=sc.nextInt();
      // int max= maximumSubArray(ar,k);
       // System.out.println(max);

       List<Integer> list= maximumSubArray2(ar,k);
       for(Integer ele:list)
       {
           System.out.println(ele);
        
       }
    }
    private static int maximumSubArray(int[] ar, int k) 
    {
        int i=0,j=0,sum=0,max=0;
        while(j<ar.length)
        {
           sum=sum+ar[j];
        if(j-i+1<k)
        {
            j++;
        }
        else if(j-i+1==k)
        {
          max=Math.max(max,sum);
            sum=sum-ar[i];
            i++;
            j++;
        }
       }
        return max;
     }
     private static List<Integer> maximumSubArray2(int[] ar, int k) 
     {
         List<Integer> ls=new ArrayList<>();
         int i=0,j=0,sum=0,max=0;
         while(j<ar.length)
         {
         sum=sum+ar[j];
         if(j-i+1<k)
         {
             j++;
         }
         else if(j-i+1==k)
         {
           ls.add(sum);
             sum=sum-ar[i];
             i++;
             j++;
         }
        }
         return ls;
      }
    
}