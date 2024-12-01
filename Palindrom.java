import java.util.Scanner;
import java.util.Stack;

class Palindrom {
  public static boolean palindrome(String str) {
    int left = 0;
    int right = str.length() - 1;
    while (left < right) {
      if (str.charAt(left) != str.charAt(right)) {
        return false;
      }
      left++;
      right--;

    }
    return true;

  }

  public static boolean palindromeUsingStack(String str) {
    Stack<Character> s = new Stack<>();
    for (int i = 0; i < str.length(); i++) {
      s.push(str.charAt(i));
    }
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) != s.pop()) {
        return false;

      }
    }

    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter String for check palindrome or not !");
    String str = sc.nextLine();
    // boolean palin = palindrome(str.toLowerCase());
    // if (palin) {
    // System.out.println("Palindrome");

    // } else {
    // System.out.println("Not a palindrome");
    // }

    boolean stack = palindromeUsingStack(str.toLowerCase());
    if (stack) {
      System.out.println("Palindrome (using stack method)");
    } else {
      System.out.println("Not a palindrome");
    }

    sc.close();
  }
}