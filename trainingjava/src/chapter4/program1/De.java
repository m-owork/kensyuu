package chapter4.program1;

public class De {
	Eemploye e = new Eemploye();
	Engineer eng = new Engineer();
	
	public void company() {
	System.out.println("会社名:BT/DE");
}
	public void list() {
		String name = e.getName(); 
		System.out.println("従業員のリスト");
		System.out.println("～～～");
		System.out.println(name);
		System.out.println("～～");
	}
	public void departmentlist() {
		String dl = e.getDepartment();
		String name = e.getName();
		String skill = eng.getSkill();
		String info = e.getInfo();
		System.out.println("部署のリスト");
		System.out.println("氏名:" + name + " " + "所属部署:" + dl + " " + "使用言語:" + skill);
		System.out.println(name + "の情報" + info);
	}
}