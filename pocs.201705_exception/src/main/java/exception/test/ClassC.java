package exception.test;

public class ClassC {
	public void funcC1() throws Exception {
		try {
		Integer i = new Integer("a");
		} catch (Exception e) {
			throw new Exception("funcC1", e);
		}
	}
}
