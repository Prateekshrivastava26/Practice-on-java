import java.util.Scanner;
public class reverseofdigit {
    public static void main(String[] args) {
        Scanner harry = new Scanner(System.in);
        System.out.println("Enter the no\n");
        int n = harry.nextInt();
        int rev=0;
        int dig=0;
        while(n>0){
            dig = n%10;
            rev = rev*10+dig;
            n=n/10;
        }
        System.out.println("Reverse of the no.is:"+rev);
    }}
