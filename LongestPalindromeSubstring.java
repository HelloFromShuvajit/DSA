public class LongestPalindromeSubstring {
    public static void main(String[] args){
        String s="racecar";
        String t="baac";
        System.out.println("Longest palindrome substring in the string "+s+ " is: "+longestPalindrome(s));
        System.out.println("Longest palindrome substring in the string "+t+ " is: "+longestPalindrome(t));
    }
    public static String  longestPalindrome(String str){
        int length = str.length();
        if(length<=1){
            return str;
        }
        String Lps="";
        for(int i=1; i<length;i++){
                int left=i;
                int right=i;
                while(str.charAt(left)== str.charAt(right))
                    {
                        left--;
                        right++;
                        if(left == -1 || right == length){
                            break;
                        }
                    }
                    String palindrome =str.substring(left+1,right);
                    if(palindrome.length()>Lps.length()){
                        Lps=palindrome;
                }
                    
                    left=i-1;
                    right=i;
                    while(str.charAt(left)== str.charAt(right))
                        {
                            left--;
                            right++;
                            if(left == -1 || right == length){
                                break;
                            }
                        }
                        palindrome =str.substring(left+1,right);
                        if(palindrome.length()>Lps.length()){
                            Lps=palindrome;
                        }
                    }
        return Lps;
    }
}
