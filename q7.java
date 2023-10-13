package ass2;
import java.util.Scanner;
public class q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //base
        int n=sc.nextInt();
        //power
        int p=sc.nextInt();
        System.out.println(power(n,p));
    }
    public static int power(int b,int p){
        if(p==0){
            return 1;

        }
        return b*power(b,p-1);
    }
}
