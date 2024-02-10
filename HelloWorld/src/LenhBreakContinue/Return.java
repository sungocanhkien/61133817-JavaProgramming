package LenhBreakContinue;

public class Return {
	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 10; j++) {
				if(i<5)
					return;
				System.out.println(i+" x "+j +" = "+(i*j)); 
			}
			System.out.println("---");
		}
		System.out.println("ABC");
	}
}
