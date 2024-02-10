package LenhBreakContinue;

public class BT_Break_Continue_Return {
	public static void main(String[] args) {
		int out, in = 0;
		outer: for (out = 0; out < 10; out++)
		{
			for(in = 0; in<20; in++)
			{
				if(in > 10)
					break outer;
			}
			System.out.println("Bên trong vòng lặp out: "+ out + ", in = " + in);
		}
		System.out.println("Bên ngoài vòng lặp out: "+ out + ", in	= " + in);
	}
}
