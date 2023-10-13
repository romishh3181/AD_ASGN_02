package ass2;

public class q8 {
    public static void main(String[] args) {
        int arr[]={5,1,6,9,7,3};
        System.out.println(spmn(arr,1));
    }
    public static int spmn(int []arr,int mn){
        if(!search(arr,0,arr.length-1,mn)){
            return mn;
        }
        if(mn==arr.length){
            return mn+1;
        }
        return spmn(arr,mn+1);}

    public static boolean search(int arr[],int start,int end,int x){
        if(end<0){
            return false;
        }
        if(arr[start]==x){
            return true;
        }
        if(arr[end]==x){
            return true;
        }
        return search(arr,start+1,end-1,x);
    }
}
