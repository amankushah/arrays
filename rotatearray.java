import java.util.Scanner;
public class rotatearray
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
        System.out.print("enter the number to rotate the array :");
        k=sc.nextInt();
        k=k%n;
          for(j=n-k;j<n;j++)
          {
            System.out.print(arr[j]);
          }
          for(i=0;i<n-k;i++)
          {

          System.out.print(arr[i]);
          }
          sc.close();
    }
}
