package ass2;
import java.util.Scanner;

public class q6 {
    static char[] sig={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
    static String ans="";
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num:");
        int num=sc.nextInt();
        System.out.println(hex(num));

    }
    public static String hex(int n){
        if(n==0){
            return ans;
        }
        int num=n%16;
        ans+=sig[num];
        n=n/16;
        hex(n);
        return ans;
    }
}
