import java.util.Scanner;
public class arraymatrix2D
{
    
    public static void main(String[] args) 
    {
        int n,i,j,h,e,k,m;
        Scanner sc =new Scanner(System.in);
        
        System.out.print("enter the number of rows : ");
        m=sc.nextInt();
        System.out.print("enter the number of columns : ");
        n=sc.nextInt();
        int arr[][]=new int[m][n];
        System.out.println("enter the elements of arrays : " );
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
               arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("matrix is : " );
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
               System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}