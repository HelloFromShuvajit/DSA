import java.util.Scanner;

public class ProductofArrayExceptItself {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int no= sc.nextInt();
        int[] arr= new int[no];
        System.out.println("Enter the elements of the array:");
        for(int i =0; i<no; i++){
            System.out.println("Enter the element at "+(i+1)+":");
            arr[i]= sc.nextInt();
        }
        sc.close();
        int[] result = new ProductofArrayExceptItself().product(arr);
        System.out.println("The result array of product of the array except itself is: ");
        int pointer=0;
        for(int num : result){
            System.out.println("product at index "+pointer+" is: "+num);
            pointer++;
        }
    }
    public int[] product(int[] arr){
        int length=arr.length;
        int[] left=new int[length];
        int[] right = new int[length];
        int[] result = new int[length];
        left[0]=1;
        for(int i=1;i<=length-1;i++){
            left[i]= left[i-1]*arr[i-1];
            }
        right[length-1]=1;
        for(int i=length-2; i>=0;i--){
            right[i]= right[i+1]*arr[i+1];
            }
        for(int i=0;i<length;i++){
            result[i]= left[i]*right[i];
            }
    return result;
    }
    }
