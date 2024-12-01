import java.util.Stack;

public class ReverseNumberUsingStack {

  public static int reverseNumber(int num) {
    Stack<Integer> stack = new Stack<>();

    while (num > 0) {
      stack.push(num % 10);
      num = num / 10;
    }

    // Rebuild the reversed number
    int reversedNum = 0;
    int placed = 1;
    while (!stack.isEmpty()) {
      reversedNum = reversedNum + stack.pop() * placed;
      placed *= 10;
    }

    return reversedNum;
  }

  public static void main(String[] args) {
    int number = 1234;
    int reversed = reverseNumber(number);
    System.out.println("Reversed number: " + reversed);
  }
}
