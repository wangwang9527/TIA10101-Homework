package HW2;

public class No5 {
	public static void main(String[] args) {
		int count = 1;
		int sum = 0;
		while (count <= 49) {
			if (count % 10 != 4 && count / 10 != 4) {
				System.out.print(count + " ");
				sum++;
			}
			count++;
		}
		System.out.println();
		System.out.println("共" + sum + "個");
	}

}