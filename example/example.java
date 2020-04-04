package example;

	public class example{
		
		public static void main(String[] args){
			System.out.println("User Information");
			System.out.println("--------------- \n");
			
			User u1 = new User("John Doe",50);
			u1.printUser();
			
			User u2 = new User("Frank Pyle", 28);		
			u2.printUser();
			
			//using constructors
			Animal a1 = new Animal("Hammerhead", "Shark");
			a1.printAnimal();
			
			Animal a2 = new Animal("Paper-kite", "Butterfly");
			a2.printAnimal();
		
		Student s1=new Student("Coco Felicity",20,8);
		s1.printStudent();
		
		Student s2 = new Student("Billy Johnson",40,8);
		s2.printStudent();
		
		a1.attack(s1);
		a2.attack(s2);
		}
	}