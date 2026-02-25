public class PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word or phrase to check: ");
        String rawInput = scanner.nextLine();


        String cleanInput = rawInput.toLowerCase().replaceAll("[^a-z0-9]", "");

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();


        for (char c : cleanInput.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        boolean isPalindrome = true;


        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }


        if (isPalindrome && !cleanInput.isEmpty()) {
            System.out.println("\"" + rawInput + "\" is a palindrome.");
        } else {
            System.out.println("\"" + rawInput + "\" is NOT a palindrome.");
        }

        scanner.close();
    }
}


