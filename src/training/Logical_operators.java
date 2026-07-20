package training;

public class Logical_operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println("------logical(&&) opertor ands-----");
		System.out.println(true&&true);
		System.out.println(true&&false);
		System.out.println(false&&true);
		System.out.println(false&&false);
		
		System.out.println((10>0)&&(10>0));
		System.out.println((10>0)&&(10<0));
		System.out.println((10<0)&&(10>0));
		System.out.println((10<0)&&(10<0));
		
		
		System.out.println("------logical (||)opertors or-----");
		System.out.println(true||true);
		System.out.println(true||false);
		System.out.println(false||true);
		System.out.println(false||false);
		
		System.out.println((10>0)||(10>0));
		System.out.println((10>0)||(10<0));
		System.out.println((10<0)||(10>0));
		System.out.println((10<0)||(10<0));
		
		
		System.out.println("------logical not (!)opertors-----");
		System.out.println(true);
		System.out.println(!true);
		System.out.println(false);
		System.out.println(!false);
		
		System.out.println(!(10>0));
		System.out.println(!(10<0));
	*/	


		int age = 20;
        boolean validID = true;

        System.out.println(age >= 18 && validID);
        
        
        int maths = 60;
        int science = 40;

        System.out.println(maths >= 35 && science >= 35);
        
        int number = 25;

        System.out.println(number >= 10 && number <= 50);
        
        String username = "admin";
        String password = "1234";

        System.out.println(username.equals("admin") && password.equals("1234"));
        
        boolean seniorCitizen = false;
        boolean student = true;

        System.out.println(seniorCitizen || student);
	}

}
