import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner an = new Scanner(System.in);
        System.out.println("Enter the no.");
        int n = an.nextInt();
        int dig, n1;
      int  sum =0;
      n1=n;
      while(n>0){
          dig = n%10;
          sum = sum + dig*dig*dig;
          n=n/10;
      }
      if(sum ==n1)
          System.out.println("Armstrong");
      else
          System.out.println("Not");
    }}
