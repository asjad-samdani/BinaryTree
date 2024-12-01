public class StringWhiteSpace {
  public static void main(String[] args) {
    String name = "           Asjad            ";
    // 1st way

    String ans = name.replaceAll("\\s+", "");
    System.out.println(ans);
    // 2nd way
    String trim = name.trim();
    System.out.println(trim);
    // 3rd way
    String rep = name.replace(" ", "");
    System.out.println(rep);

  }

}
