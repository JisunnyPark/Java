package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {

		Class c1 = Class.forName("ch04.Person");
		
		Person person = (Person)c1.newInstance();
		
		// == Person p  = new Person();
		// p.setName("Lee");
		// --> DB에 연동할 때 동적 로딩하여 사용할 수 있다
		
		person.setName("Lee");
		System.out.println(person);
		
		Class c2 = person.getClass(); // newinstance() 해줘야 사용 가능
		Person p = (Person)c2.newInstance(); 
		System.out.println(p); // null 출력
		
		Class[] parameterTypes = {String.class};
		Constructor cons = c2.getConstructor(parameterTypes);
	
		Object[] initargs = {"Kim"};
		Person kimPerson = (Person)cons.newInstance(initargs);
		System.out.println(kimPerson);
		
		// ==
		// Person kim2 = new Person("Kim");
	}
}
