package HW1;

public class No3 {

	public static void main(String[] args) {
		int a = 256559;// 1天24小時,1小時60分,1分60秒

		System.out.println(a / (60 * 60 * 24) + "天或是" + a / (60 * 60) + "小時或是" + a / 60 + "分" + a % 60 + "秒");

	}
}
