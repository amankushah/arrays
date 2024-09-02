import java.util.*;
public class setmatriceszero
{
    
    public static void main(String[] args) 
    {
        int m,n,i,j,k,a=-1,b=-1;
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
        int helper[][]= new int[m][n];
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
               helper[i][j]=arr[i][j];
            }
        }

        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i!=a && j!=b)
               {
                if(arr[i][j]==0)
                {
                    
                    a=i;
                    b=j;
                    for(k=0;k<n;k++)
                    {
                      helper[i][k]=0;
                    }
                    for(k=0;k<m;k++)
                    {
                      helper[k][j]=0;
                    }
                }

                }
            }
        }
        System.out.println("after setting zero the matrix is : " );
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
               System.out.print(helper[i][j]+" ");
            }
            System.out.println();
        }

    }
}


