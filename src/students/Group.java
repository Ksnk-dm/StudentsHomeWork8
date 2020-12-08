package students;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

public class Group implements Serializable {
	private Stud[] group = new Stud[10];
	private String nameGroup;

	public Group(Stud[] group, String nameGroup) {
		super();
		this.group = group;
		this.nameGroup = nameGroup;
	}

	public Group() {
		super();
	}

	public Group(String nameGroup) {
		super();
		this.nameGroup = nameGroup;
	}

	public Stud[] getGroup() {
		return group;
	}

	public void setGroup(Stud[] group) {
		this.group = group;
	}

	public String getNameGroup() {
		return nameGroup;
	}

	public void setNameGroup(String nameGroup) {
		this.nameGroup = nameGroup;
	}

	@Override
	public String toString() {
		return "Group [group=" + Arrays.toString(group) + ", nameGroup=" + nameGroup + "]";
	}

	public void add(Stud st) {

		for (int i = 0; i < group.length; i++) {
			if (group[i] == null) {
				group[i] = st;
				System.out.println("студент " + st + " добавлен");
				return;

			}
		}
	}

	public void printgroup() {
		for (Stud k : group) {
			System.out.println(k);
		}

	}

	public static void saveGroupe(Group group) {
		try (ObjectOutputStream write = new ObjectOutputStream(new FileOutputStream(group.nameGroup))) {
			write.writeObject(group);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Group readGroup(String nameGroup) {
		Group group = new Group();
		try (ObjectInputStream read = new ObjectInputStream(new FileInputStream(nameGroup))) {
			group = (Group) read.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return group;
	}

}
