package DSA;
/* Algorithm to check if the given string is a palindrome */

public class palindrome {

    public boolean getPalindrome(String name){
        char[] charArray = name.toCharArray();
        int start = 0;
        int end = name.length() - 1;
        while(start < end){
            if(charArray[start] != charArray[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        palindrome p = new palindrome();
        System.out.println(p.getPalindrome("that"));
        
    }
}
