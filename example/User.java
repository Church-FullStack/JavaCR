package example;

	public class User {
		private String name;
		private int age;
		
		//setters
		public User(String name, int age) {
			setName(name);
			setAge(age);
		}
		
		public void setName(String name) {
			this.name=name;
		}
		//getter
		public void setAge(int age) {
			if(age<100) {
				this.age=age;
			}
			else {
				System.out.println("Error: age is incorrect");
			}
		}
		
		public String getName() {
			return this.name;
		}
		
		public int getAge() {
			return this.age;
		}
		
		//methods
		public void printUser() {

			System.out.println("Name:" +this.name);
			System.out.println("Age:" +this.age);
			System.out.println("---------------");
		}
	
	
	
	
	}