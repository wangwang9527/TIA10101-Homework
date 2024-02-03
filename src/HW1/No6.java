package HW1;

public class No6 {

	public static void main(String[] args) {
		System.out.println(5 + 5);// 單純為數學上的和
		System.out.println(5+'5');// '5'為字元,對照unicode字元5是0035,換算成十進位為53,故5+53=58
		System.out.println(5 + "5");// "5"雙引號則沒限制只能放單一字元,也同樣是數字5旁邊放一個字為5
	}
}
