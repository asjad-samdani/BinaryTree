import java.util.Stack;

public class StackExample {
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    stack.push(10);
    stack.push(20);
    stack.push(30);
    stack.push(40);
    System.out.println("Stack after pushes: " + stack);
    // Peek the element
    System.out.println("Top element : " + stack.peek());
    // pop
    System.out.println("Popped element : " + stack.pop());
    System.out.println("Stack after pop : " + stack);

    while (!stack.isEmpty()) {
      System.out.print(stack.pop() + " ");
    }

  }

}
