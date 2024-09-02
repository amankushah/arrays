import java.util.Scanner;
public class spiralofmatrix
{
    
    public static void main(String[] args) 
    {
        int m,n,i,j;
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
        int minr=0,minc=0,maxr=m-1,maxc=n-1;
        System.out.println("the spiral of matrix is : " );
        while(minr<=maxr||minc<=maxc)
        {
        for(j=minc;j<=maxc;j++)
        {
            System.out.print(arr[minr][j]+" ");
        }
        minr++;
        if(minr>maxr||minc>maxc) break;
        for(i=minr;i<=maxr;i++)
        {
            System.out.print(arr[i][maxc]+" ");
        }
        maxc--;
        if(minr>maxr||minc>maxc) break;
        for(j=maxc;j>=minc;j--)
        {
            System.out.print(arr[maxr][j]+" ");
        }
        maxr--;
        if(minr>maxr||minc>maxc) break;
        for(i=maxr;i>=minr;i--)
        {
            System.out.print(arr[i][minc]+" ");
        }
        minc++;
       }



        
       sc.close();

    }
}