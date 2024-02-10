package LenhBreakContinue;

public class Continue {
	public static void main(String[] args) {
		int max = 100;
		loop: for(int i=0; i<max; i++)
		{
			if(i<50)
				continue loop;
			System.out.println(i);
		}
		System.out.println("End!");
	}
}
