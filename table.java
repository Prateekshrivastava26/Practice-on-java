import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter the no.");
        int n = ab.nextInt();
        int i =1 ;
        while(i<=10){
            System.out.println("Table:"+i*n);
            i++;
        }
    }
}
