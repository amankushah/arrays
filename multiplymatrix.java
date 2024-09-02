import java.util.*;
public class multiplymatrix
{
    
    public static void main(String[] args) 
    {
        int m,n,p,q,i,j,k;
        Scanner sc =new Scanner(System.in);
        
        System.out.print("enter the number of rows of 1st matrx : ");
        m=sc.nextInt();
        System.out.print("enter the number of columns of 1st matrx : ");
        n=sc.nextInt();
        int arr[][]=new int[m][n];
        System.out.println("enter the elements of 1st matrix : " );
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
               arr[i][j]=sc.nextInt();
            }
        }
        
        System.out.print("enter the number of rows of 2nd matrx : ");
        p=sc.nextInt();
        System.out.print("enter the number of columns of 2nd matrx : ");
        q=sc.nextInt();
        int brr[][]=new int[p][q];
        System.out.println("enter the elements of 2nd matrix : " );
        for(i=0;i<p;i++)
        {
            for(j=0;j<q;j++)
            {
               brr[i][j]=sc.nextInt();
            }
        }
        System.out.println("the 1st matrix is : " );
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
               System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("the 2nd matrix is : " );
        for(i=0;i<p;i++)
        {
            for(j=0;j<q;j++)
            {
               System.out.print(brr[i][j]+" ");
            }
            System.out.println();
        }
        int crr[][] = new int[m][q];
        if(n!=p) System.out.println("multiplication is not possiple");
        else
        {
            
            for(i=0;i<m;i++)
            {
                for(j=0;j<q;j++)
                {
                    for(k=0;k<p;k++)
                    {
                     
                        crr[i][j] += arr[i][k] * brr[k][j];
                    }
                }
        
                
            }
        
            System.out.println("matrix formed after multiplication is :");
            for(i=0;i<m;i++)
            {
                for(j=0;j<q;j++)
                {
                    System.out.print(crr[i][j]+" ");
                }
                System.out.println();
            }

        }
    }
}

