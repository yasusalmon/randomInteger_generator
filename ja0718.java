import java.util.*;

public class ja0718{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("hello random");
    System.out.print("min:1 max:");
    int input = sc.nextInt();
    if(input < 1)input = 1;
    Random rand = new Random();
    int generate = rand.nextInt(input) + 1;
    System.out.println("");
    System.out.println("answer is " + generate);
  }
}
