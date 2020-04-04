package example;

public class Animal {
		//attributes
		public String type;
		public String name;
		
		//constructor
		public Animal(String name,String type) {
			this.name=name;
			this.type=type;
		}
		public void printAnimal() {
			System.out.println("****************");
			System.out.println("Name: " + name);
			System.out.println("Type: " + type);
			System.out.println("*****************");
		}
		
		public void attack(Student s) {
			System.out.println(this.name + " " + this.type + " " + "attacks" + " "+ s.getName() );
		}
	}