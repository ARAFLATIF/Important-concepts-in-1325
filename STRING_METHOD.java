//Creating a custom method to work with Strings:

public class StringUtils {
    // Custom method to count vowels in a string
    public static int countVowels(String str) {
        if (str == null) return 0;
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String text = "Hello World";
        System.out.println("Vowels in '" + text + "': " + countVowels(text));
    }
}

//This example defines a custom method countVowels   that works with String objects.

//Creating a wrapper class with custom String methods:

public class EnhancedString {
    private String originalString;

    public EnhancedString(String str) {
        this.originalString = str;
    }

    // Custom method to reverse the string
    public String reverse() {
        return new StringBuilder(originalString).reverse().toString();
    }

    // Custom method to count words
    public int wordCount() {
        if (originalString == null || originalString.isEmpty()) return 0;
        return originalString.trim().split("\\s+").length;
    }

    // Override toString method
    @Override
    public String toString() {
        return originalString;
    }

    public static void main(String[] args) {
        EnhancedString es = new EnhancedString("Java Programming");
        System.out.println("Original: " + es);
        System.out.println("Reversed: " + es.reverse());
        System.out.println("Word count: " + es.wordCount());
    }
}
//This example creates a wrapper class EnhancedString that adds custom functionality to work with strings.

//Extending the String class (Note: String is final, so this is just for demonstration):

public class CustomString {
    private String internalString;

    public CustomString(String str) {
        this.internalString = str;
    }

    // Custom method to capitalize first letter of each word
    public String capitalizeWords() {
        if (internalString == null || internalString.isEmpty()) return internalString;
        
        StringBuilder result = new StringBuilder();
        String[] words = internalString.split("\\s");
        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1).toLowerCase())
                      .append(" ");
            }
        }
        return result.toString().trim();
    }

    // Delegate method
    public int length() {
        return internalString.length();
    }

    @Override
    public String toString() {
        return internalString;
    }

    public static void main(String[] args) {
        CustomString cs = new CustomString("hello world");
        System.out.println("Original: " + cs);
        System.out.println("Capitalized: " + cs.capitalizeWords());
        System.out.println("Length: " + cs.length());
    }
}

//This example creates a CustomString class that wraps a String and adds custom functionality.

/* Key Points:
You can create utility classes with static methods to work with Strings.
You can create wrapper classes to add functionality to Strings.
While you can't directly extend the String class (it's final), you can create classes that encapsulate a String and provide additional methods.
When defining custom String methods, consider null checks and edge cases.
You can override existing methods (like toString()) in your custom classes to provide specific behavior for String representations.
These examples demonstrate different ways to define custom methods for working with Strings in Java, allowing you to extend functionality beyond what's provided by the standard String class.
*/
