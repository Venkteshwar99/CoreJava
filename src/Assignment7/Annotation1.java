package Assignment7;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.*;  
import java.lang.reflect.*;  


//

    @Target(ElementType.METHOD)
	@Retention(RetentionPolicy.RUNTIME)

	@interface Test{
		
		String TestCase() ;
	}


	class test1{	
		//creating the custom annotation @test
		
		  @Test(TestCase = "Welcome to Custom Annotation which is @Test")
		  public void sayHello()
		      {
			  System.out.println("Lets try annotation");
			  }  
	}
		
		

	public class Annotation1 {
		
		public static void main(String[] args) throws Exception {
			
			test1 t = new test1();
			
			
			Method ant = t.getClass().getMethod("sayHello");
			Annotation annotation = ant.getAnnotation(Test.class);
			Test ts = (Test)annotation;
			System.out.println( ts.TestCase());
			
		}

	
}
