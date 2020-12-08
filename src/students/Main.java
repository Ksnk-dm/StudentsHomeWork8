package students;

public class Main {

	public static void main(String[] args) {

		Group gr1 = new Group("oop");
		Group gr2 = new Group("oksm");
		Stud stud1 = new Stud("vasiliy", "pypkin", 17, 35);
		Stud stud2 = new Stud("vasiliy", "pypkin", 17, 35);
		Stud stud3 = new Stud("vova", "kecher", 11, 23);
		Stud stud4 = new Stud("galia", "voevoda", 19, 35);
		Stud stud5 = new Stud("anya", "petrova", 22, 35);
		Stud stud6 = new Stud("dmitry", "petrov", 15, 35);
		Stud stud7 = new Stud("dmitry", "petrov", 15, 35);
		Stud stud8 = new Stud("dmitry", "petrov", 15, 35);
		Stud stud9 = new Stud("dmitry", "petrov", 15, 35);
		Stud stud10 = new Stud("dmitry", "petrov", 15, 35);

		gr1.add(stud1);
		gr1.add(stud2);
		gr1.add(stud3);
		gr1.add(stud4);
		gr1.add(stud5);
		gr1.add(stud6);
		gr1.add(stud7);
		gr1.add(stud8);
		gr1.add(stud9);
		gr1.add(stud10);

		gr1.saveGroupe(gr1);
		gr1.readGroup("oop").printgroup();

	}

}
