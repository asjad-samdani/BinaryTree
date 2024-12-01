import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter to find height");
    int H = sc.nextInt();
    int height = (int) (H * Math.pow(2, 6));
    System.out.println(height);
    sc.close();
  }

}
