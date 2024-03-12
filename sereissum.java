import java.util.Scanner;
public class sereissum {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter the no.");
        int n = ab.nextInt();
        int ans =0;
        for (int i=1;i<=n;i++)
        {
            if(i%2==0)
               ans -= i;
            else
                ans += i;
        }
        System.out.println(ans);
    }}
