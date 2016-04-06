package lab3_2_2;

import lab3_2_1_and_3.Employee;

import java.io.*;

/**
 * Created by m18 on 06.04.2016.
 */
public class Main {
    public static void main(String[] args) {
        Employee employee;
        ObjectInputStream employeeInput;
        try {
            InputStream inputStream = new FileInputStream("employees.ser");
            employeeInput = new ObjectInputStream(inputStream);
            employee = (Employee) employeeInput.readObject();
            System.out.println(employee);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
