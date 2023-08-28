import java.util.Arrays;
public class Frequancy {

    static int find(int[] arr, int val)
    {
        int quantity=0;
        for (int i: arr)
        {
            if (i == val)
            {
                quantity++;
            }
        }
        return quantity;
    }






    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] dup = new int[arr.length];
        System.out.println("Frequancy rates: ");
        int ind = 0;
        for (int i = 0; i<arr.length;i++)
        {
            int c =0;
            for (int j: dup){
                if (j==arr[i])
                {
                    c++;
                }
            }
            if (c==0)
            {
                dup[ind]=arr[i];
                ind++;
            }
        }
        for (int i:dup)
        {
            if (i!=0)
            {
                System.out.println("For the number "+i+" the quantity is: " + find(arr,i));
            }
        }
    }
}
