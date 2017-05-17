package exception.test;

public class ClassB {
	public void funcB1() throws Exception {
		ClassC cls = new ClassC();
		try {
			cls.funcC1();
		} catch (Exception e) {
			throw new Exception("chain", e);
		}
		return;
	}
}
