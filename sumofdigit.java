

import java.util.Scanner;
public class sumofdigit {
    public static void main(String[] args) {
        Scanner nn = new Scanner(System.in);
        System.out.println("Enter the no\n");
        int n = nn.nextInt();
int sum =0;
        int dig = 0;
        while(n>0){
            dig =n%10;
            sum = sum +dig;
            n=n/10;
        }
        System.out.println("The sum of digit is:"+sum);
    }}
