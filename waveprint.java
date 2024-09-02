import java.util.Scanner;
public class waveprint
{
    
    public static void main(String[] args) 
    {
        int n,i,j,m;
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
        System.out.println("the matrix is : " );
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
               System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("the wave of matrix is : " );
        for(i=0;i<m;i++)
        {
            if((i%2)==0)
            {
            for(j=0;j<n;j++)
            {
                
             System.out.print(arr[i][j]+" ");
            }
            }
            else
            {
                    for(j=n-1;j>=0;j--)
                    {
                  
                   System.out.print(arr[i][j]+" ");
                    }
             }
         }
        
       sc.close();

    }
}