import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter the no. of term ");
        int n = ab.nextInt();
        int a=0;
       int b = 1;
        int next;
        System.out.println(a+b);
        for (int i=0 ;i<=n-2;i++){
            next = a+b;
            System.out.println(next);
            a=b;
            b=next;
        }
    }}
