package Practice.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {

	public static void main(String[] args) throws Exception {
			
			Dog dog1 = new Dog("Rolex" , 2);
			Dog dog2 = new Dog("Bruno" , 8);
			Class c = Dog.class;
			
			Field[] dogFields1 = dog1.getClass().getDeclaredFields(); //shows all fields except inherited  fields
//			for(Field field : dogFields1) {
//				System.out.println(field.getName());
//				if(field.getName().equals("name")) {
//					field.setAccessible(true);			//accessing private field
//					field.set(dog1, "Rocky");
//				}
//				System.out.println(field.get(dog1));
//				System.out.println(field.get(dog2));
//			}

			
			Field[] dogFields2 = dog1.getClass().getFields();		// shows only public fields
//			for(Field field : dogFields2) {
//				System.out.println(field.getName());
//			}
			
			Field dogField1 = dog1.getClass().getField("age");		//getField cannot access name as it is not public
			System.out.println(dogField1);
			
			Field dogField2 = dog1.getClass().getDeclaredField("name");	//getDeclaredField can access all fields
//			System.out.println(dogField2);
			
			int modifiers = dog1.getClass().getModifiers();
//			System.out.println(modifiers);
			
			Method[] dogMethods1 = dog2.getClass().getDeclaredMethods();
//			for(Method method : dogMethods1) {
//				System.out.println(method.getName());
//				System.out.println(method.getReturnType());
//				System.out.println(method.getParameterCount());
				
//				// Modifier value of
				// public = 1
				// protected = 4
				// default = 0
				// private = 2
//				System.out.println(method.getModifiers());
				
//				if(method.getName().equals("bark"))
//					method.invoke(dog1);
//			}
//			
			Method[] dogMethods2 = dog2.getClass().getMethods();
//			for(Method method : dogMethods2) {
//				System.out.println(method.getName());
//			}

            Method dogMethod = 
					dog1.getClass().getDeclaredMethod("sleep",int.class);
			dogMethod.invoke(dog1,6);
			
			Constructor[] dogConstructors = dog1.getClass().getDeclaredConstructors();
//			for(Constructor construct : dogConstructors) {
//				System.out.println(construct.getName());
//				System.out.println(construct.getParameterCount());
//			}
	}

}


class Dog{
	private final String name;
	public int age;
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	 
	public void bark() {
		System.out.println("Bark! Bark!");
	}
	
	void sleep(int duration) {
		
	}
	
	String getName() {
		return name;
	}
}
