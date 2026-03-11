public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "madam";

        boolean result = check(input, 0, input.length() - 1);
        System.out.println("input :" + input);
        System.out.println("ispalindrome :" + result);
    }

    private static boolean check(String input, int start, int end) {
        if (start >= end) {
            return true;
        }

        if (input.charAt(start) != input.charAt(end)) {
            return false;
        }

        return check(input, start + 1, end - 1);
    }
}