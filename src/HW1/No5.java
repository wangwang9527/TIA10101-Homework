package HW1;

public class No5 {
//銀行存150萬,銀行利率2%,每年利息都存入銀行,10年後本金+利息=?(複利計算)
	// 公式:本金*(1+年利率)^年數
	public static void main(String[] args) {
		int a = 1500000,c=10;
		double b = 1.02;
		double d =Math.pow(b,c);

		System.out.println("第十年本金+利息是" + a*d);
	}
}
