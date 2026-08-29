public class palindrome_number {
    public static void main(String[] args) {
        int num = 123235;
        int reverse = 0;
        int original = num;
        while (num != 0) {
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num / 10;
        }
        if (original == reverse) {
            System.out.println("the number is palindrome");
        } else {
            System.out.println("the number is not palindrome");

        }
    }
}
