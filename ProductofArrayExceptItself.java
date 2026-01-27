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
            System.out.println(num);
        }

    }
    public int[] product(int[] arr){
        int pointer=0;
        int[] result = new int[arr.length];
        for(pointer=0;pointer<arr.length;pointer++){
            int product=1;
             
            for(int i=0; i<arr.length;i++){
                if (pointer!=i) {
                    product= product*arr[i];
                }
            }
            result[pointer]= product;
        }
    return result;
    }
    }
