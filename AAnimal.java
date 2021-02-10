package test;

public class AAnimal {
	class Shouting
	{
		void shout()
		{
			System.out.println("Animals make sound like :");
		}
	class Dog extends Shouting 
	{

		@Override
		void shout() {
			System.out.println("The barking of dog: WOOF WOOF");
		}
	}
	class Horse extends Shouting
	{

		@Override
		void shout() {
			System.out.println("The shouting of horse is :neigh");
		}
		
	}
	class Cat extends Shouting
	{

		@Override
		void shout() {
			System.out.println("cat says MEOW");
		}
		
	}

	class Animal {
		public void main(String[] args) {
			
			Shouting s= new Shouting();
			s.shout();
			
			Dog d= new Dog();
			d.shout();
			
			Horse h=new Horse();
			h.shout();
			
			Cat c=new Cat();
			c.shout();
			
			
		}
	}
	}


}
