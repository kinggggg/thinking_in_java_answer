// exceptions/LostMessageFound19.java
// TIJ4 Chapter Exceptions, Exercise 19, page 479
// Repair the problem in LostMessage.java by guarding the call in the
// finally clause.

class VeryImportantException extends Exception {
	public String toString() {
		return "A very important exception!";
	}
}

class HoHumException extends Exception {
	public String toString() {
		return "A trivial exception";
	}
}

public class LostMessageFound19 {
	void f() throws VeryImportantException {
		throw new VeryImportantException();
	}
	void dispose() throws HoHumException {
		throw new HoHumException();
	}
	public static void main(String[] args) {
		try {
			LostMessageFound19 lmf = new LostMessageFound19();
			try {
				lmf.f();
			} catch(Exception e) {
				System.out.println(e);
			} finally {
				lmf.dispose();
			}

		} catch(Exception e) {
			System.out.println(e);
		}
	}
}