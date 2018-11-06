
public class TestSetterDI {

	public static void main(String[] args) {
		 ClassA classA = new ClassA();
		  ClassB classB = new ClassB();
		  //Setter based Dependency Injection
		  classB.setClassA(classA);//set방식 주입식 방법
		  classB.methodB();
		 
	}

}
