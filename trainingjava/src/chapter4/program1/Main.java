package chapter4.program1;

public class Main {
	public static void main(String[] args) {
		De de = new De();
		HumanResource hr = new HumanResource();
		Sales sl = new Sales();
	System.out.println("【実装力チェックテスト「04_クラスの継承」を実行します。】");
	System.out.println("～会社について～");
	de.company();
	de.list();
	de.departmentlist();
	
	System.out.println("～人事について～");
	hr.jobinterview();
	
	System.out.println("～営業について～");
	sl.weekly();
	sl.interview();
	sl.meeting();
	
	System.out.println("【これにて実装力チェックテスト「04_クラスの継承」を終了します。】");
	}
}