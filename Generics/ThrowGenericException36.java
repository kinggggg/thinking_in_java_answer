// generics/ThrowGenericException36.java
// TIJ4 Chapter Generics, Exercise 36, page 713
// Add a second parameterized exception to the Processor class and 
// demonstrate that the exceptions can vary independently.
import java.util.*;

interface Processor<T,E extends Exception, E2 extends Exception> {
	void process(List<T> resultCollector) throws E,E2;
}

class ProcessRunner<T,E extends Exception, E2 extends Exception> 
extends ArrayList<Processor<T,E,E2>> {
	List<T> processAll() throws E,E2 {
		List<T> resultCollector = new ArrayList<T>();
		for(Processor<T,E,E2> processor : this)
			processor.process(resultCollector);
		return resultCollector;
	}
}

class Failure1 extends Exception {}

class Failure3 extends Exception {}

class Processor1 implements Processor<String,Failure1,Failure3> {
	static int count = 3;
	public void
	process(List<String> resultCollector) throws Failure1, Failure3 {
		if(count-- > 1)
			resultCollector.add("Hep!");
		else
			resultCollector.add("Ho!");
		if(count < 0)
			throw new Failure1();
		if(count < -1)
			throw new Failure3();
	}
}

class Processor1b implements Processor<String,Failure1,Failure3> {
	static int count = 3;
	public void
	process(List<String> resultCollector) throws Failure1, Failure3 {
		if(count-- > 1)
			resultCollector.add("Hep!");
		else
			resultCollector.add("Ho!");
		if(count < 0)
			throw new Failure1();
		if(count == 1)
			throw new Failure3();
	}
}

class Failure2 extends Exception {}

class Processor2 implements Processor<Integer,Failure2,Failure3> {
	static int count = 2;
	public void
	process(List<Integer> resultCollector) throws Failure2, Failure3 {
		if(count-- == 0)
			resultCollector.add(47);
		else {
			resultCollector.add(11);
		}
		if(count < 0)
			throw new Failure2();
		if(count < -1)
			throw new Failure3();
	}
}

class Processor2b implements Processor<Integer,Failure2,Failure3> {
	static int count = 2;
	public void
	process(List<Integer> resultCollector) throws Failure2, Failure3 {
		if(count-- == 0)
			resultCollector.add(47);
		else {
			resultCollector.add(11);
		}
		if(count < 0)
			throw new Failure2();
		if(count == 1)
			throw new Failure3();
	}
}

public class ThrowGenericException36 {
	public static void main(String[] args) {
		ProcessRunner<String,Failure1,Failure3> runner =
			new ProcessRunner<String,Failure1,Failure3>();
		for(int i = 0; i < 3; i++)
			runner.add(new Processor1());
		try {
			System.out.println(runner.processAll());
		} catch(Failure1 e) {
			System.out.println(e);
		} catch(Failure3 e) {
			System.out.println(e);
		}
		ProcessRunner<String,Failure1,Failure3> runnerb =
			new ProcessRunner<String,Failure1,Failure3>();
		for(int i = 0; i < 3; i++)
			runnerb.add(new Processor1b());
		try {
			System.out.println(runnerb.processAll());
		} catch(Failure1 e) {
			System.out.println(e);
		} catch(Failure3 e) {
			System.out.println(e);
		}
		ProcessRunner<Integer,Failure2,Failure3> runner2 =
			new ProcessRunner<Integer,Failure2,Failure3>();
		for(int i = 0; i < 3; i++)
			runner2.add(new Processor2());
		try {
			System.out.println(runner2.processAll());
		} catch(Failure2 e) {
			System.out.println(e);
		} catch(Failure3 e) {
			System.out.println(e);
		}
		ProcessRunner<Integer,Failure2,Failure3> runner2b =
			new ProcessRunner<Integer,Failure2,Failure3>();
		for(int i = 0; i < 3; i++)
			runner2b.add(new Processor2b());
		try {
			System.out.println(runner2b.processAll());
		} catch(Failure2 e) {
			System.out.println(e);
		} catch(Failure3 e) {
			System.out.println(e);
		}
	}
	
}	