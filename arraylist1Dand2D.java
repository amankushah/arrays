import java.util.*;
public class arraylist1Dand2D
{
    
    public static void main(String[] args) 
    {
        int n,i;
        Scanner sc =new Scanner(System.in);
        
        System.out.print("enter the size of array : ");
        n=sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(n);
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();
        List<List<Integer>> brr = new ArrayList<>();
        System.out.println("enter the elements of array : ");
        for(i=0;i<n;i++)
        {
            arr.add(i,sc.nextInt());

        }
        arr.add(6);
       System.out.println(arr);
       arr.set(1,0);
       arr.remove(0);
       System.out.println(arr);
       System.out.println(arr.get(3));
       a.add(39); a.add(67);
       b.add(11); b.add(34);b.add(56);
       c.add(00000);
       brr.add(arr);;brr.add(a);brr.add(b);brr.add(c);
       System.out.println(brr);
       System.out.println(brr.get(2).get(1));

        sc.close();
    }
}