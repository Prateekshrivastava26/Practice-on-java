import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter the no.");
        int n = ab.nextInt();
        int dig , rev=0;
        int n1;
        n1=n;
        while(n>0)
        {
            dig=n%10;
            rev=rev*10+dig;
            n=n/10;
        }
        if(rev==n1)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }}
