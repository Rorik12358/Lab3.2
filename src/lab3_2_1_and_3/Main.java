package lab3_2_1_and_3;

import java.io.*;

/**
 * Created by m18 on 06.04.2016.
 */
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Bob");
        employee.setAdress("Franco's square");
        employee.setNumber(1232341);
        employee.setSSN(555);
        ObjectOutputStream employeeOutput = null;
        try {
            FileOutputStream fos = new FileOutputStream("employees.ser");
            employeeOutput = new ObjectOutputStream(fos);
            employeeOutput.writeObject(employee);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (employeeOutput != null){
                try {
                    employeeOutput.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
