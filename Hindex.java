import java.util.Arrays;

public class Hindex {
    public static void main(String[] args) {
        int[] citations ={10,0,4,6,5};
        Arrays.sort(citations);
        int result= Hindexing(citations);
        System.out.println("The H index for the citations is:" +result);
    }
    public static int Hindexing(int[] arr){
        int j=0;
        while(j<arr.length && arr[arr.length-1-j]>j){
            j++;
        }
        return j;
    }
}
