public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "racecar";
        System.out.println("The longest Palindrome of the string "+s+" is "+longestpalindrome(s));
    }
    public static String longestpalindrome(String s){
        int length = s.length();
        int start=0;
        int end=length-1;
        int i=0;
        if (length!=0) {
            while(start<end && i<length-i){
                char left=s.charAt(i);
                char right=s.charAt(length-i);
                if(left!=right){
                    start=+1;
                    end=-1;
                }
                i++;
            }
            
        }
        return "";
    }
}
