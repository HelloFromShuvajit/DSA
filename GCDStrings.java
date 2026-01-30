public class GCDStrings {
    public static void main(String[] args){
        String string1= "zyxzyx";
        String string2= "zyxzyxzyx";
        String result1= gcdOfStrings(string1,string2);
        System.out.println("The GCD of the first two strings is: " +result1);
        String string3= "abcabc";
        String string4= "zyxzyx";
        String result2= gcdOfStrings(string3,string4);
        System.out.println("The GCD of the second two strings is: " +result2);
    }
    public static int gcd(int a, int b){
        if (b==0){
            return a;
        }
        return gcd(b, (a%b));
    }
    public static String gcdOfStrings(String string1, String string2){
        String concaenated1 = (string1+string2);
        String concaenated2 = (string2+string1);
        if (!concaenated1.equals(concaenated2)) {
        return "";            
        }
        int minLength = gcd(string1.length(), string2.length());
        return string1.substring(0, minLength);

    }
}
