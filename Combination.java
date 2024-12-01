import java.util.Scanner;

public class Combination {
  public static int factorial(int n) {
    int fact = 1;
    for (int i = 1; i <= n; i++) {
      fact *= i;
    }
    return fact;
  }

  private static int Combinations(int n, int k) {
    if (k > n) {
      return 0;
    }

    // C(n, 0) and C(n, n) are both equal to 1
    if (k == 0 || k == n) {
      return 1;
    }
    return factorial(n) / factorial(k) * factorial(n - k);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int n = sc.nextInt();
    int k = sc.nextInt();

    System.out.println("Answer :" + Combinations(n, k));
    sc.close();

  }

}
