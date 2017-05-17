package exception.test;

public class ClassB {
	public void funcB1() throws ControllerException {
//	public void funcB1() throws Exception {
		ClassC cls = new ClassC();
		try {
			cls.funcC1();
		} catch (ModelException e) {
			throw new ControllerException("funcB1 のＤＢ接続で例外", e);
		}
//		} catch (Exception e) {
//			throw e;
//		}
		return;
	}
}
