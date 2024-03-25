import java.util.Scanner;
public class decimal_to_binary {
    public static void main(String[] args) {
        Scanner harry = new Scanner(System.in);
        System.out.println("Enter the binary no.");
        int decimal_num = harry.nextInt();
        int ans = 0;
        int pw = 1;
        while(decimal_num>0)
        {
            int parity = decimal_num % 2;
            ans = ans +(parity*pw);
            pw = pw * 10;
            decimal_num = decimal_num / 2;
        }
        System.out.println(ans);
    }}
