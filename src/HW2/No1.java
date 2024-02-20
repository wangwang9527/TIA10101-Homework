package HW2;

public class No1 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 2 == 1) {
				continue;// i除2餘數是1則跳過continue以下的敘述,回到迴圈的起始點
			}

			sum += i;// += 累加

		}
		System.out.println(sum);// 需注意system.out.println顯示的位置,擺在sum+=下面等同為FOR迴圈裡會不斷地換行
	}                           //顯示結果要放在for迴圈的大括號外,顯示最後累加結果

}
