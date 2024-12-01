import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ReverseArrayUsingStack {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
    Stack<Integer> stack = new Stack<>();
    for (Integer num : list) {
      stack.push(num);
    }
    List<Integer> reverse = new ArrayList<>();
    while (!stack.isEmpty()) {
      reverse.add(stack.pop());

    }
    reverse.forEach(System.out::print);

  }

}
