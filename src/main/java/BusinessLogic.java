public class BusinessLogic {

    // 1. Method to calculate discount
    public int calculateDiscount(int price, int percentage) {
        return price * percentage / 100;
    }

    // 2. Method to check if a user is valid based on username length
    public boolean isValidUser(String username) {
        return username != null && username.length() > 5;
    }

    // 3. Method to calculate the sum of two numbers
    public int addTwoNumbers(int a, int b) {
        return a + b;
    }

    // 4. Method to generate a welcome message
    public String getWelcomeMessage(String name) {
        return "Welcome, " + name + "!";
    }

    // 5. Method to calculate tax on a given income
    public double calculateTax(double income) {
        return income * 0.2; // Assuming 20% tax rate
    }

    // 6. Method to check if a number is prime
    public boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // 7. Method to encrypt data using a simple Caesar cipher
    public String encryptData(String data, int shift) {
        StringBuilder result = new StringBuilder();
        for (char c : data.toCharArray()) {
            result.append((char) (c + shift));
        }
        return result.toString();
    }

    // 8. Method to check if a word is a palindrome
    public boolean isPalindrome(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equals(reversed);
    }

    // 9. Method to calculate factorial of a number
    public int calculateFactorial(int number) {
        if (number == 0) return 1;
        return number * calculateFactorial(number - 1);
    }

    // 10. Method to generate a token based on user ID (vulnerable code)
    public String generateToken(String userId) {
        return userId + "12345"; 
    }
}
