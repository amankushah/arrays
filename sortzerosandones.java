import java.util.Scanner;
public class sortzerosandones
{
    
    public static void main(String[] args) 
    {
        int n,i,j,h,e,k=0,m=0;
        Scanner sc =new Scanner(System.in);
        
        System.out.print("enter the size of array :");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements of arrays : " );
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
          for(j=0;j<n;j++)
          {
            if(arr[j]==0)
            { 
                k++;
            }
            else 
            {
                m++;
            }
        }
        for (h=0;h<k;h++)
          {
            arr[h]=0;
          }
          int z=m+k;
          for (e=k;e<z;e++)
          {
            arr[e]=1;
          }
          System.err.print("the sorted arrays is :");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

    
    }
}