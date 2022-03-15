package javaWcp;

public class Chapter08_2 {
	public static void main(String[]args) {
		String week="Sunday";
		switch (week) {
		case"sunday":
			System.out.println("日曜日です");
			break;
		case"monday":
			System.out.println("月曜日です");
			break;
		case"tuesday":
			System.out.println("火曜日です");
			break;
		case"wednesday":
			System.out.println("水曜日です");
			break;
		case"thursday":
			System.out.println("木曜日です");
			break;
		case"friday":
			System.out.println("金曜日です");
			break;
		case"saturday":
			System.out.println("土曜日です");
			break;
			default:
				System.out.println("曜日ではありません");
			
			
		}
	}
}
