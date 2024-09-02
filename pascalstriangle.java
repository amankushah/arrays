import java.util.*;
public class pascalstriangle
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        n=sc.nextInt();
        List<List<Integer>> arr = new ArrayList<>(n);
        for(i=0;i<n;i++)
        {
            List<Integer> ar = new ArrayList<>(i+1);
            for(j=0;j<=i;j++)
            {
                if(j==0 || j==i) ar.add(1);
                else
                {
                    ar.add(arr.get(i-1).get(j)+arr.get(i-1).get(j-1));
                }
            }
            arr.add(ar);

        }
        for(i=0;i<n;i++)
        System.out.println(arr.get(i));
        sc.close();
    }
}

        

