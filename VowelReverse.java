import java.util.Scanner;

public class VowelReverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word =  sc.nextLine();
        sc.close();
        String reversedVowelWord = reverseVowel(word);
        System.out.println(word+" after reversing vowels becomes: "+ reversedVowelWord);
    }
    public static String reverseVowel(String word){
    String vowels = "aeiouAEIOU";
    char[] charArray = word.toCharArray();
    int leftPointer= 0;
    int rightPointer = charArray.length -1;
    while(leftPointer < rightPointer){
        while(leftPointer < rightPointer && vowels.indexOf(charArray[leftPointer])==-1){
            leftPointer++;
        }
        while (leftPointer< rightPointer && vowels.indexOf(charArray[rightPointer])==-1) {
            rightPointer--;
        }
        char temp =charArray[leftPointer];
        charArray[leftPointer] = charArray[rightPointer];
        charArray[rightPointer] = temp;
        leftPointer++;
        rightPointer--;
    }
    return new String(charArray);
}
}
