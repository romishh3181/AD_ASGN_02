package ass2;
import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two nums:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        gcd(n1,n2);
    }
    public static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b,a%b);
    }
}
