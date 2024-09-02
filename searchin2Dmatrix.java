import java.util.*;
public class searchin2Dmatrix
{
    
    public static void main(String[] args) 
    {
        int m,n,i,j,num,flag=0;
        Scanner sc =new Scanner(System.in);
        
        System.out.print("enter the number of rows : ");
        m=sc.nextInt();
        System.out.print("enter the number of columns : ");
        n=sc.nextInt();
        int arr[][]=new int[m][n];
        System.out.println("enter the elements of matrix : " );
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
        System.out.print("enter the no. to search in matrix : ");
        num = sc.nextInt();
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(arr[i][j]==num) flag =1;
        
              
            }
        }
        if(flag==1) System.out.println("Number is found");
        else System.out.println("Number is not found");

    }
}
