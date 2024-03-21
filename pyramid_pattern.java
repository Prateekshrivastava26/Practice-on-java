import java.util.Scanner;
public class pyramid_pattern {
    public static void main(String[] args) {
        Scanner nw = new Scanner(System.in);
        System.out.println("Enter no. of rows ");
        int r=nw.nextInt();

        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=r-i;j++)
            {
                System.out.print(" ");
            }
            for(int k= 1; k<=2*i-1;k++)
            {
                System.out.print("&");
            }
            System.out.println();
        }
    }}
