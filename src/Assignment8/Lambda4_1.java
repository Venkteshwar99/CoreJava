package Assignment8;

import java.util.ArrayList;

public class Lambda4_1 {
	

	    public static void main(String[] args)
	    {
	        ArrayList<Integer> students = new ArrayList<Integer>();

	        students.add(32);
	        students.add(56);
	        students.add(67);
	        students.add(43);
	        students.add(87);
	        students.removeIf(n -> (n %2!=0));
	        
	        System.out.println("Students name with odd lengths is removed");
	        for (int i: students) {
	            System.out.println(i);
	        }
	    }
}