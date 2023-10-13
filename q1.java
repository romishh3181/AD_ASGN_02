package ass2;
//import java.util.Scanner;
//import com.sun.jdi.PathSearchingVirtualMachine;

//FIND SUM OF N NUMBERS USING RECURSION:)
public class q1 {
    public static void main(String[] args) {
        int arr[]={12,56,8,7,45};
        int n=arr.length;
        int start=0;
        System.out.println(sum(arr,n,start));

    }
    public static int sum(int[] array, int len,int start){

        if(start==len){
            return 0;
        }
       return array[start]+sum(array,len,start+1);
}
}
