package reflexion;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Calculator {

    void sum(int a, int b) {
        int result = a + b;
        System.out.println("Suma " + a + " i " + b + " = " + result);

    }

    void substraction(int a, int b) {
        int result = a - b;
        System.out.println("Raznita " + a + " i " + b + " = " + result);

    }

    void multiplication(int a, int b) {
        int result = a * b;
        System.out.println("Delenie " + a + " i " + b + " = " + result);

    }

    void division(int a, int b) {
        int result = a / b;
        System.out.println("Chastnoe " + a + " i " + b + " = " + result);

    }
}


class TestCalculator {
    public static void main(String[] args) {
        try (
                BufferedReader reader = new BufferedReader(new FileReader("test100.txt"))
        ) {

            String methodName = reader.readLine();
            String firstArgument = reader.readLine();
            String secondArgument = reader.readLine();
            Calculator calculator = new Calculator();

            Class cl = calculator.getClass();
            Method method = null;

            Method[] methods = cl.getDeclaredMethods();
            for (Method MyMet : methods) {

                if (MyMet.getName().equals(methodName)) {
                    method = MyMet;
                }
            }

            method.invoke(calculator, Integer.parseInt(firstArgument), Integer.parseInt(secondArgument));


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }

}