package ExceptionHandling;

public class student {
	private String name;
	private String sex;

	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) throws Exception {
		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z')) {
				throw new Exception("Name field cant be empty");
			}
		}

		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception { // declare dangerous function
		if (age < 0) {
			throw new Exception("age cant be negative");
		}

		this.age = age;
	}

}
