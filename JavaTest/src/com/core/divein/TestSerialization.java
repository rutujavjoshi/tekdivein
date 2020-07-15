package com.core.divein;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerialization {

	public static void main(String[] args) {
		//serializeTheObj();
		deSerializeTheObj();
	}

	private static void serializeTheObj() {
		Employee e = new Employee();
		e.name = "Renuka Shah";
		e.address = "21 Paradise Planet";
		e.SSN = 11122333;
		e.number = 101;

		try {
			FileOutputStream fileOut = new FileOutputStream("C:\\temp\\employee.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved in C:\\temp\\employee.ser");
		} catch (IOException i) {
			i.printStackTrace();
		}
	}

	public static void deSerializeTheObj() {
		Employee e = null;
		try {
			FileInputStream fileIn = new FileInputStream("C:\\temp\\employee.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			e = (Employee) in.readObject();
			in.close();
			fileIn.close();
			e.mailCheck();
		} catch (IOException i) {
			i.printStackTrace();
			return;
		} catch (ClassNotFoundException c) {
			System.out.println("Employee class not found");
			c.printStackTrace();
			return;
		}

	}
}

class Employee implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String name;
	public String address;
	public transient int SSN;
	public int number;

	public void mailCheck() {
		System.out.println("Mailing a check to " + name + "\n" + address);
	}
}
