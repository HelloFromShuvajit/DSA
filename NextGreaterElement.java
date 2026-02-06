import java.util.Arrays;

public class NextGreaterElement {
    public static void main(String[] args){
        int[] num1={1,3,2};
        int[] num2={3,4,2,1};
        int[] res=nextgreaterelement(num1,num2);
        System.out.println(Arrays.toString(res));
    }
    public static int[] nextgreaterelement(int[] num1, int[] num2){
        int[] res = new int[num1.length];
        Arrays.fill(res, -1);

        for(int i=0; i<num1.length;i++){
            boolean found= false;
            for(int j=0;j<num2.length;j++){
                if (found && num2[j]>num1[i]) {
                    res[i]=num2[j];
                    break;
                }
                if (num2[j]== num1[i]) {
                    found = true;
                    
                }
            }
        }
        return res;
    }
}
