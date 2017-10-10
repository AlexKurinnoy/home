import java.util.Scanner;
public class MyFirstApp{
	public static void main(String[] args){

		while(true){
			System.out.println("Enter number");
			Scanner input = new Scanner(System.in);
			int x=input.nextInt()%2;
			if (x == 0) {
				System.out.println("Even number");
				return;
			}
			else{
				System.out.println("odd number");
				return;
			}
		}

	}

}