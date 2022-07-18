import java.util.*;

public class ja0718{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("hello random");
    System.out.print("min:0 max:");
    int input = sc.nextInt();
    Random rand = new Random();
    int generate = rand.nextInt(input + 1);
    System.out.println("");
    System.out.println("answer is " + generate);
  }
}
