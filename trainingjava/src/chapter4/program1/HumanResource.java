package chapter4.program1;

public class HumanResource extends Eemploye {
	private String result;
	public void jobinterview() {
		System.out.println("社員面接");
		System.out.println("面接を行い、結果は" + result + "だった");
		System.out.println("給与計算");
		System.out.println("給与計算を行った");		
	}
	public void result() {
		boolean result = true;
		if (result == true) {
			System.out.println("合格");
		} else if (result == false) {
			System.out.println("不合格");
	}
	}
	}