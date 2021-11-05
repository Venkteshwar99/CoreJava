package Assignment8;

import java.util.ArrayList;
import java.util.function.UnaryOperator;

class Op implements UnaryOperator<String> {
		   public String apply(String str) {
		      return str.toUpperCase();
		   }
		}
		public class Lambda6 {
		   public static void main(String[] args) {
		      ArrayList<String> list = new ArrayList<>();
		      list.add("Hi");
		      list.add("i am");
		      list.add("Venkteshwar");
		      list.add("i am doing");
		      list.add("good");
		      System.out.println("Contents of the list before conversion: "+list);
		      list.replaceAll(new Op());
		      System.out.println("\nContents of the list after replace operation: "+list);
		   }
		}
