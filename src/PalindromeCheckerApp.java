public class PalindromeCheckerApp {
    public static void main(String[] args){
        public static boolean isPalindrome(String input) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter any word or phrase: ");
            String originalInput = sc.nextLine();


            String cleanInput = originalInput.toLowerCase().replaceAll("[^a-z0-9]", "");


            Stack<Character> stack = new Stack<>();
            for (char c : cleanInput.toCharArray()) {
                stack.push(c);
            }


            boolean isPalindrome = true;
            for (char c : cleanInput.toCharArray()) {
                if (c != stack.pop()) {
                    isPalindrome = false;
                    break;
                }
            }


            if (isPalindrome && !cleanInput.isEmpty()) {
                System.out.println("\"" + originalInput + "\" is a palindrome!");
            } else {
                System.out.println("\"" + originalInput + "\" is NOT a palindrome.");
            }

            sc.close();
    }
}


