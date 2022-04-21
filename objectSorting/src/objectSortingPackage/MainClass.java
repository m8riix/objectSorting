package objectSortingPackage;

import java.util.ArrayList;
import java.util.Collections;

public class MainClass {

	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("zain",7,"delhi"));
		list.add(new Student("alexa",2,"kolkata"));
		list.add(new Student("chintu",9,"bihar"));
		list.add(new Student("anwar",3,"bihar"));
		list.add(new Student("arpita",55,"jamshedpur"));
		
		//sorting using comparable
		Collections.sort(list);
		System.out.println(list);

		//sorting using comparator class;
		Collections.sort(list,new ComparatorClass());
		System.out.println(list);
	}

}
