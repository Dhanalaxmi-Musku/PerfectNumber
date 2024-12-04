import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);        
        System.out.print("Enter a number to check if it's a Perfect Number: ");
        int number = scan.nextInt();
        if (isPerfectNumber(number)) {
            System.out.println(number + " is a Perfect Number.");
        } else {
            System.out.println(number + " is not a Perfect Number.");
        }

	}
	public static boolean isPerfectNumber(int num) {
        int divisorSum = 0;
        for (int i = 1; i < num ; i++) {
            if (num % i == 0) {
                divisorSum += i;
            }
        }
        return divisorSum == num;
    }

}
