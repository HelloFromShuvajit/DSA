public class Anagram{
    public static void main(String[] args){

        String S = "garden";
        String T = "danger";
        if (isAnagram(S,T)) {
            System.out.println("The strings are anagram.");
        }
        else{
            System.out.println("The strings are not anagram.");
        }
    }

    public static boolean isAnagram(String S, String T)
    {
        if(S.length()!= T.length()){
            return false;
        }
        int[] counter = new int[26];
        for(int i=0; i<S.length();i++){
            char charS= S.charAt(i);
            char charT= T.charAt(i);
            counter[charS-'a']++;
            counter[charT-'a']--;
        }
        for(int count : counter){
            if (count!= 0) {
                return false;
            }
        }
    return true;
    }
}