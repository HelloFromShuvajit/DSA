package Searching;

import java.util.*;
public class GuessTheNum {
    public static void main(String[] args){
        System.out.println(("Enter the highest range:"));
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the number to be picked:");
        int pick = sc.nextInt();
        sc.close();
        int result = guessNumber(n,pick);
        if (result == -1) {
            System.out.println("Number not found in the range.");
        }else{
            System.out.println("The number picked is:"+ result);
        }
    }
    public static int guess(int mid, int pick){
        if(mid == pick){
            return 0;
        }
        else if (mid>pick){
            return -1;
        }
        else{
            return 1;
        }
    }
    public static int guessNumber(int n, int pick){
        int low = 1;
        int high =n;
        while (low<=high){
            int mid= low+(high-low)/2;
            int result = guess(mid,pick);
            if(result == 0){
                return mid;
            }
            else if(result<0){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }

}
