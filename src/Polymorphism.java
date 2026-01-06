public class Polymorphism {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        animalEating(dog);
        animalEating(cat);

        }
    public static void animalEating(Animal animal){
        animal.eat();
    }
}

class Animal{
    public void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("Dog is eating");
    }
}

class Cat extends Animal{
    public void eat(){
        System.out.println("Cat is eating");
    }
}
