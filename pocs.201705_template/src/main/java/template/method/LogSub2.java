package template.method;

public class LogSub2 extends LogSuper {

	@Override
	public void func1() {
		System.out.println("業務処理２");
	}

	public static void main(String args[]) {
		LogSub2 obj = new LogSub2();
		// プログラム構成テンプレートを呼び出す
		obj.proc();
	}
}
