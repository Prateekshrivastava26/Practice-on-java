import java.util.Scanner;
public class pattern_1 {
    public static void main(String[] args) {
        Scanner nw = new Scanner(System.in);
        System.out.println("Enter no. of rows and columns");
        int r=nw.nextInt();
        int c = nw.nextInt();
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=c;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }}
