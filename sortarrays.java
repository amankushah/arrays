import java.util.*;
public class sortarrays
{
    
    public static void main(String[] args) 
    {
        int n,i;
        Scanner sc =new Scanner(System.in);
        
        System.out.print("enter the size of array : ");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements of array : ");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("after sorting the elements of array : ");
        Arrays.sort(arr);
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}



