public class CompareToIgnoreCaseExample {
  public static void main(String[] args) {
    String str1 = "apple";
    String str2 = "Apple";

    // Case-sensitive comparison
    int result1 = str1.compareTo(str2);
    System.out.println("compareTo result: " + result1);

    // Case-insensitive comparison
    int result2 = str1.compareToIgnoreCase(str2);
    System.out.println("compareToIgnoreCase result: " + result2);

  }
}
