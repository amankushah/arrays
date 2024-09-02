import java.util.*;
public class makebinarysumtomax
{
    
    public static void main(String[] args) 
    {
        int m,n,i,j,k,c0,c1,t,num,sum=0;
        Scanner sc =new Scanner(System.in);
        
        System.out.print("enter the number of rows : ");
        m=sc.nextInt();
        System.out.print("enter the number of columns : ");
        n=sc.nextInt();
        int arr[][]=new int[m][n];
        System.out.println("enter the elements of grid only 0's and 1's : " );
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
               arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("the grid is :");

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
            t=1;
            num=0;

            for(j=n-1;j>=0;j--)
            {
               num += arr[i][j]*t;
               t=2*t;
            }
            sum += num;
            System.out.println(i+1+"-row decimal no. is : " + num);
        }
        System.out.println("sum of each row is : " +sum);
        sum=0;


        for(i=0;i<m;i++)
        {
              if(arr[i][0]==0)
               {
                arr[i][0]=1;
                   for(k=1;k<n;k++)
                   {
                   if(arr[i][k]==0) arr[i][k]=1;
                   else arr[i][k]=0;
               }


            }
        }
        System.out.println("after 1st fliping the grid is :");
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
            t=1;
            num=0;

            for(j=n-1;j>=0;j--)
            {
               num += arr[i][j]*t;
               t=2*t;
            }
            sum += num;
            System.out.println(i+1+"-row decimal no. is : " + num);
        }
        System.out.println("sum of each row is : " +sum);
        sum=0;


        for(i=1;i<n;i++)
        {
            c0=0;
            c1=0;
            for(j=0;j<m;j++)
            {
              if(arr[j][i]==0) c0++;
              else c1++;
            }
            if(c0>c1)
            {
                for(k=0;k<m;k++)
                   {
                   if(arr[k][i]==0) arr[k][i]=1;
                   else arr[k][i]=0;
                   }
            }
        }
        System.out.println("after final fliping the grid is :");
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
            t=1;
            num=0;

            for(j=n-1;j>=0;j--)
            {
               num += arr[i][j]*t;
               t=2*t;
            }
            sum += num;
            System.out.println(i+1+"-row decimal no. is : " + num);
        }
        System.out.println("sum of each row is : " +sum+ " ,so it is maximum .");
        sum=0;

    }
}