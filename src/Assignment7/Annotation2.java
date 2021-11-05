package Assignment7;


	import java.lang.annotation.ElementType;
	import java.lang.annotation.Retention;	
	import java.lang.annotation.RetentionPolicy;
	import java.lang.annotation.Target;
	import java.lang.annotation.Annotation;
	import java.util.*;



	@Target(ElementType.TYPE)
	@Retention (RetentionPolicy.RUNTIME)
	@interface Info  {
		
		    int AuthorID () default 1;
			String Author()  default "Venkteshwar";
			
			String Date() default "03/11/2021";
			String TIme() default "10:50";
			int Version() default 12;
			String Description() default "Hello to the custom annotation @Info";
		
			
			
		}


	@Info ()
	class myclass{
			
			
		}
	public class Annotation2 {
			
		public static void main(String[] args) {
				
				myclass ns = new myclass();
				
			
				Class f  = ns.getClass();
				Annotation annn = f.getAnnotation(Info.class);
				Info i = (Info)annn;
				
				
				
				System.out.println("AuthorID:"+i.AuthorID()); 
				System.out.println("Author:"+i.Author()); 
			
				System.out.println("Date:"+i.Date()); 
				System.out.println("Time:"+i.TIme()); 
				System.out.println("Version:"+i.Version()); 
				System.out.println("Description:"+i.Description()); 
				
				 
			}

		}


