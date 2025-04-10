package chapter4.program1;

public class Engineer extends Eemploye {
	Eemploye e = new Eemploye();
	private String skill = "使用言語:JAVA、Pythonを使用";
	
		public String getSkill() {
			return this.skill;
	}
	public void implementation() {
		String skill = getSkill();
		System.out.println("開発実施");
		System.out.println(skill + "開発を行った");
	}
	public void display() {
		String skill = getSkill();
		String info = e.getInfo();
		System.out.println("情報表示");
		System.out.println(info + "　" + "使用言語" + skill);
	}
}