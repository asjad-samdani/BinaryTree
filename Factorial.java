public class Factorial {
  public static int fact(int num) {
    if (num == 0 || num == 1) {
      return 1;
    }
    return num * fact(num - 1);
  }

  public static void main(String[] args) {
    int n = 5;
    System.out.println(fact(n));
    int fact = 1;
    while (n > 1) {
      fact *= n;
      n--;

    }
    System.out.println(fact);
  }

}