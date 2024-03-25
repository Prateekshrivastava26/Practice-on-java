import java.util.Scanner;
public class numerical_pattern {
    public static void main(String[] args) {
        Scanner nw = new Scanner(System.in);
        System.out.println("Enter no. of rows ");
        int r=nw.nextInt();

        for(int i=1;i<=r;i++)
        {
            for(int j=i;j<=r;j++)
            {
                System.out.print(j);
            }
            for(int k= 1; k<=i-1;k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }}
