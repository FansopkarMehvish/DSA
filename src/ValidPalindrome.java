import java.util.Scanner;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        int leftPointer = 0;
        int rightPointer = s.length() - 1;

        while(leftPointer < rightPointer){
            if(!Character.isLetterOrDigit(s.charAt(leftPointer))){
                leftPointer++;
            }
            if(!Character.isLetterOrDigit(s.charAt(rightPointer))){
                rightPointer++;
            }
            if((Character.toLowerCase(s.charAt(leftPointer)) != Character.toLowerCase(s.charAt(rightPointer)))){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ValidPalindrome validPalindrome = new ValidPalindrome();
        System.out.println(validPalindrome.isPalindrome(s));
    }
}
