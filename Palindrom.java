import java.util.Scanner;

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

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter String for check palindrome or not !");

    String str = sc.nextLine();
    boolean palin = palindrome(str.toLowerCase());
    if (palin) {
      System.out.println("Palindrome");

    } else {
      System.out.println("Not a palindrome");
    }
    sc.close();
  }
}