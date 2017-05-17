package template.method;

public class LogSub extends LogSuper {

	@Override
	public void func1() {
		System.out.println("業務処理１");
	}

	public static void main(String args[]) {
		LogSub obj = new LogSub();
		// プログラム構成テンプレートを呼び出す
		obj.proc();
	}
}
