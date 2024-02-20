package Practice;

public class Student {
	int score = 90;
	
	// 每休息一個小時，score就會減1
	public void play(int hours) {
		score -= hours;
	}
	
	// 每讀書一個小時，score就會加1
	public void study(int hours) {
		score += hours;
	}
	
	// 創建兩個student物件, 各別呼叫play(), study()模擬行為, 最後顯示兩位學生成績
	public static void main(String[] args) {
		Student david = new Student();
		Student james = new Student();
		
		System.out.println(david.score);
		System.out.println(james.score);
		
		david.play(2);
		david.study(6);
		
		james.play(5);
		james.study(2);
		
		System.out.println("===========");
		
		System.out.println(david.score);
		System.out.println(james.score);
	}
}
