class Product {
  public static void main(String[] args) {
    int num = 1234;
    int product = 1;

    while (num > 0) {
      int digit = num % 10;
      product *= digit;
      num = num / 10;

    }
    System.out.println(product);

    while (num > 0) {
      product *= num;
      num--;

    }
    System.out.println(product);

    /*
     * String str = Integer.toString(num);
     * for (int i = 0; i < str.length(); i++) {
     * int digit = Character.getNumericValue(str.charAt(i));
     * product *= digit;
     * }
     */

  }
}
