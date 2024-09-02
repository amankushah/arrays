import java.util.Scanner;
public class foreachloopuse
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
        for(int x:arr)
        {
            System.out.print(x+" ");
        }
        sc.close();
    }
}

        
