package First_Task;

import java.lang.reflect.Field;

public class Main {

	public static void main(String[] args) {

		getAnnotationField(House.class);
	
	}
	
	public static void getAnnotationField(Class<?> myClass) {
		Field[] field = myClass.getDeclaredFields();
		
		for(int i=0; i<field.length; i++) {
			if(field[i].getAnnotation(MyAnnotation.class) instanceof MyAnnotation) {
				System.out.println(field[i].getName().toUpperCase() + " <--> params = '" + field[i].getAnnotation(MyAnnotation.class).params()
					+ "' ; value = '" + field[i].getAnnotation(MyAnnotation.class).value() + "'.");
				System.out.println();

			}
		}
	}

}
