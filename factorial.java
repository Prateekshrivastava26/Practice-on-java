import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter the no.");
        int n = ab.nextInt();
        int i=1;
        int f= 1;
                while(i<=n) {
                    f = f * i;
                    i++;
                }
        System.out.println("Factorial: "+f);
    }}
