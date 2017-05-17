package exception.test;

public class ClassC {
	public void funcC1() throws ModelException {
//	public void funcC1() throws Exception {
		try {
		    Integer i = new Integer("a");
		} catch (NumberFormatException e) {
			throw new ModelException("引数のバリデーションチェックで例外", e);
		}
//		} catch (Exception e) {
//			throw new Exception(e);
//			throw e;
//		}

	}
}
