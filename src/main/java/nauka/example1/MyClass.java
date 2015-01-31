package nauka.example1;

public class MyClass {
	private final String prefix;
	
	public MyClass(){
		this("unknown");
	}
	
	public MyClass(String prefix){
		this.prefix = prefix;
	}
	
	public int add(int i, int j) {
		if (i > 10) {
			return i * 2 - j;
		}
		return i + j;
	}

	public String addKrowaToString(String input) {
		
		return prefix+":"+ input;
	}
}
