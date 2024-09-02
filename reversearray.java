import java.util.*;
public class reversearray
{
    
    public static void main(String[] args) 
    {
        int n,i,tp,a=1;
        Scanner sc =new Scanner(System.in);
        
        System.out.print("enter the size of array : ");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements of array : ");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("the array  is: ");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("the reverse of array  is: ");
        for(i=0;i<n/2;i++)
        {
            
            tp=arr[n-a];
            arr[n-a]=arr[i];
            arr[i]=tp;
            a++;
        }
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }


        sc.close();
    }
}

