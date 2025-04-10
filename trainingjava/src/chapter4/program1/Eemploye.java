package chapter4.program1;

public class Eemploye {
	private String name = "A";
	private String department = "エンジニア";
	private String info = "氏名:" + name + " "+ "所属:" + department;
	
	public String getName() {
		return this.name; 
	}
	public String getDepartment() {
		return this.department;
	}
	public String getInfo() {
		return this.info;
}
}