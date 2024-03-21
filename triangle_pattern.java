import java.util.Scanner;
public class triangle_pattern {
    public static void main(String[] args) {
        Scanner nw = new Scanner(System.in);
        System.out.println("Enter no. of rows ");
        int r=nw.nextInt();

        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }}
