public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String number = "" + x;
        String reverse = "";
        int y = 0;
        for (int i = number.length() - 1; i >= 0; --i){
            reverse = reverse + number.charAt(i);
        }
        if (number.toLowerCase().equals(reverse.toLowerCase())){
            return true;
        } else {
            return false;
        }
    }
}