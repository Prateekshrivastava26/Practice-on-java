import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter the no.");
        int a = ab.nextInt();
        int b = ab.nextInt();
        int ans = 1;
        for (int i = 1;i<=b;i++){
            ans *=a;
        }
        System.out.println(ans);
    }
}
