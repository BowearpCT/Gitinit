
public class Main {
	import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		
		Hello hello = new Hello();
		hello.setName(str);
		System.out.println(hello.getName);
	}

}

}
