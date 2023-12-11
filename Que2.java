package Assignment;

public class Que2 {
	class Main {
		  public static void main(String[] args) {

		    int n = 10, firstNum = 0, secondNum = 1;
		    System.out.println("Output:");

		    for (int i = 1; i <= n; ++i) {
		      System.out.print(firstNum + ", ");
		      int next = firstNum + secondNum;
		      firstNum = secondNum;
		      secondNum = next;
		    }
		  }
		}


}
