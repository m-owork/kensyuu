package chapter4.program1;

public class Sales extends Eemploye {
	Eemploye e = new Eemploye();
	Engineer eng = new Engineer();
	
	public void weekly() {
		System.out.println("週報の返信をした");
	}
	public void interview() {
		String Name = e.getName();
		System.out.println(Name + "の面談を組んだ");
	}
	public void meeting() {
		System.out.println("新規の打ち合わせをした");
	}
	}
