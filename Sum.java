public class Sum {
  public static void main(String[] args) {
    int num = 1234;
    int sum = 0;
    while (num > 0) {
      int result = num % 10;
      sum += result;
      num = num / 10;

    }
    System.out.println(sum);

    while (num > 0) {
      sum += num;
      num--;

    }
    System.out.println(sum);

  }

}
