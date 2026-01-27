import java.util.Scanner;
public class MergeAlternateletter {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first word:");
        String word1=sc.nextLine();
        System.out.println("Enter the second word:");
        String word2=sc.nextLine();
        sc.close();
        System.out.println("The merged word is: "+new MergeAlternateletter().mergeAlternately(word1,word2));
    }
    public String mergeAlternately(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < Math.max(m, n); i++) {
            if (i < m) {
                result.append(word1.charAt(i));
            }
            if (i < n) {
                result.append(word2.charAt(i));
            }
        }
        return new String(result);

    }
}