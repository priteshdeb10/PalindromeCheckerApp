public class PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any word: ");

        String input = scanner.nextLine();


        String word = input.toLowerCase();


        Deque<Character> deque = new ArrayDeque<>();


        for (char c : word.toCharArray()) {
            deque.addLast(c);
        }


        boolean isPalindrome = true;


        while (deque.size() > 1) {

            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }


        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is NOT a palindrome.");
        }

        scanner.close();
    }
}


