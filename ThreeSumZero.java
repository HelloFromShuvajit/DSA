import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumZero {

    public List<List<Integer>> sumZero(int[] arr){
        List<List<Integer>> result = new ArrayList<>();
        int length = arr.length;
        for(int i=0; i<length-2;i++){
            if (arr[i]>0){
                 break; 
            } 
            if (i>0 && arr[i]==arr[i-1]) {
                continue;
            }
            sumtwo(arr,i,result);
        }
        return result;
    }
    private void sumtwo(int[] arr, int i, List<List<Integer>> result){
        int low = i+1;
        int high = arr.length-1;
        while(low<high){
            int sum = arr[i]+arr[low]+arr[high];
            if (sum==0)
            {
                result.add(Arrays.asList(arr[i],arr[low],arr[high]));
            }else if (sum<0){
                low++;
            } else{
                high--;
            }
            low++;
            high--;
            while(low<high && arr[low] == arr[low-1])
            {
                low++;
            }
        }
    }
    public static void main(String[] args){
        int[] arr= {-1,0,1,2,-1,-4};
        Arrays.sort(arr);
        ThreeSumZero tZero = new ThreeSumZero();
        List<List<Integer>> triplets = tZero.sumZero(arr);
        System.out.println("The triplets that sum to zero are:");
        for(List<Integer> triplet :triplets){
            System.out.println(triplet);
        }
    }
}
