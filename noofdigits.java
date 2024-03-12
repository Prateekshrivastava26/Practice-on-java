import java.util.Scanner;
public class noofdigits {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter the no.\n");
        int a = ab.nextInt();
        int no_of_digit = 0;
        while(a>0){
            a=a/10;
            no_of_digit++;
        }
        System.out.println("No of digit is:"+ no_of_digit);
    }
}
