public class PalindromeCheckerApp {
    public static void main(String[] args){
        public static boolean isPalindrome(String input) {

            input = input.toLowerCase();

            int start = 0;
            int end = input.length() - 1;

            while (start < end) {
                if (input.charAt(start) != input.charAt(end)) {
                    return false;
                }
                start++;
                end--;
            }
            return true;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a word: ");
            String input = scanner.nextLine();

            boolean result = isPalindrome(input);

            System.out.println("Input : " + input);
            System.out.println("Is Palindrome? : " + result);

            scanner.close();
    }
}


