package template.method;

public abstract class LogSuper {
	/**
	 * ログ出力
	 * @param message
	 */
	public void log(String message) {
		System.out.println(message);
	}

	/**
	 * 業務処理：subクラスで実装
	 */
	abstract public void func1();

	/**
	 * プログラム構成テンプレート
	 */
	public void proc() {
		log("start");
		func1();
		log("end");
	}
}
