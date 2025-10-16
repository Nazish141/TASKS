class Dog {
   String name;
   int age;
   String breed;
   public void bark(){
    System.out.println(name + " barks loudly! woof! ");
   }
}
public class DogClass{
    public static void main(String[]args){
        Dog dog1 = new Dog();
        dog1.name="jack";
        dog1.breed="labrador";
        dog1.age=5;
        Dog dog2 = new Dog();
        dog2.name="tommy";
        dog2.breed="pitbull";
        dog2.age=4;
        dog1.bark();
        dog2.bark();
    
    }
}
