package uvu.cs.cs3250.inclass;

public interface ClassDemo {
	default String getDescription() {
		return "This is an interface";
	}
	
	String echo(String message);
}
