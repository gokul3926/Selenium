package org.gokul;

public class Singleton1 {

	static Singleton1 a;

	public static Singleton1 studentId() {

		if (a == null) {

			int BeforeObject = System.identityHashCode(a);
			System.out.println(BeforeObject);

			a = new Singleton1();

			int AfterObject = System.identityHashCode(a);
			System.out.println(AfterObject);

		}
		return a;

	}

	private void empId() {
		System.out.println("emyttedrfgtyhhgedfrg");

	}

	public static void main(String[] args) {

		Singleton1 studentId = studentId();

		studentId.empId();

		int Dummy = System.identityHashCode(studentId);
		System.out.println(Dummy);
		Singleton1 studentId2 = studentId();
		int Dummy2 = System.identityHashCode(studentId2);
		System.out.println(Dummy2);
		Singleton1 studentId3 = studentId();
		int Dummy3 = System.identityHashCode(studentId3);
		System.out.println(Dummy3);

	}

}
