
public class Main {

	public static void main(String[] args) {
		System.out.println("時刻に経過時間を足して、経過後時刻を表示しなさい");
		System.out.print("何分か入力しなさい：");
		int minute = new java.util.Scanner(System.in).nextInt();
		System.out.print("何秒か入力しなさい：");
		int second = new java.util.Scanner(System.in).nextInt();
		System.out.println("経過時間を秒で入力しなさい：");
		int elapsed = new java.util.Scanner(System.in).nextInt();
		System.out.print(minute + "分" + second + "秒の" + elapsed + "秒後は、");

		int after = second + elapsed;
		if (after >= 60) {
			int minute1 = minute + after / 60;
			System.out.println("経過後時間は" + minute1 + "分" + after % 60 + "秒である。");
		} else {
			System.out.println("経過後時間は" + minute + "分" + after + "秒である。");
		}
	}
}
