package HW_20;

import java.lang.annotation.Annotation;

public class ReflectionMain {
    public static void main(String[] args) {
        //https://jenkov.com/tutorials/java-reflection/classes.html
        //https://www.oracle.com/technical-resources/articles/java/javareflection.html#:~:text=Java%20reflection%20is%20useful%20because,%2B%2B%2C%20Fortran%2C%20or%20Pascal.
        Man man = new Man("Sergey Morozov", 28, 76);
        try {
            var method = man.getClass().getMethod("classInfo", null);
            method.invoke(man, null);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        HelloWorld hello = new HelloWorld();
        try {
            var method = hello.getClass().getMethod("printHelloWorld", null);
            method.invoke(hello, null);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        try {
            var methodWithAnnotation = HelloWorld.class.getMethod("methodWithAnnotation", null);
            if(methodWithAnnotation.getAnnotationsByType(AcademyInfo.class).length > 0)
            {
                System.out.printf("Method %s contains AcademyInfo\n", methodWithAnnotation.getName());
            }
            else{
                System.out.printf("Method %s does not contain AcademyInfo\n", methodWithAnnotation.getName());
            }

            var methodWithoutAnnotation = hello.getClass().getMethod("methodWithoutAnnotation", null);
            if(methodWithoutAnnotation.getAnnotationsByType(AcademyInfo.class).length > 0)
            {
                System.out.printf("Method %s contains AcademyInfo\n", methodWithoutAnnotation.getName());
            }
            else{
                System.out.printf("Method %s does not contain AcademyInfo\n", methodWithoutAnnotation.getName());
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
