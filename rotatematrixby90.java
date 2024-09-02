import java.util.Scanner;
public class rotatematrixby90
{
    
    public static void main(String[] args) 
    {
        int n,i,j,h,g,tp,k,m;
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
        for(i=0;i<m;i++)
        {
            for(j=0;j<i;j++)
            {
                tp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=tp;
            }
        }


        System.out.println("the transpose of matrix is : " );
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
               System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        for(i=0;i<m;i++)
        {
            h=0;g=m-1;
            while(h<g)
            {
            
               
                k=arr[i][h];
                arr[i][h]=arr[i][g];
                arr[i][g]=k;
                h++;
                g--;
            }
        }
        
        System.out.println("after rotation  by 90 the  matrix is : " );
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