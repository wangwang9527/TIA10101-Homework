package HW2;

public class No7 {
	public static void main(String[] args) {
		char letters='\u0041';
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(letters);
			}
			letters++;
			System.out.println();
		}
	}

}