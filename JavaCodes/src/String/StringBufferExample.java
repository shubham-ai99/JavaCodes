package String;
import java.lang.StringBuffer;


public class StringBufferExample {
    public static void main(String[] args) {
        // Create a StringBuffer object
        StringBuffer buffer = new StringBuffer("Hello");

        // Append more characters to the buffer
        buffer.append(" World");

        // Insert characters at a specific position
        buffer.insert(5, ", ");

        // Replace characters in the buffer
        buffer.replace(0, 5, "Greetings");

        // Delete characters from the buffer ....it will delete , and space in this example
        buffer.delete(9, 11);

        // Print the contents of the buffer
        System.out.println(buffer); // Output: Greetings, World
    }
}
