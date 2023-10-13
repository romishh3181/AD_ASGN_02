package ass2;
//find max and min in an array
public class q2 {
    public static void main(String[] args) {
        int arr[] = {12, 56, 8, 7, 45};
        int n = arr.length;
        int start = 0;
        System.out.println(max(arr,start,n));
        System.out.println(min(arr,start,n));
    }
    public static int max(int []array,int start,int len){
        if(start==len){
            return array[start];
        }
        return Math.max(array[len-1],max(array,start,len-1));
    }
    public static int min(int []array,int start,int len){
        if(start==len){
            return array[start];
        }
        return Math.min(array[len-1],min(array,start,len-1));
    }

}

