import java.util.ArrayList;


public class DogDemo {



public static void main(String[] args)
{
    Dog dog1= new Dog("GiGi");
    dog1.setAge(15);
    System.out.println(dog1.getAge());
    System.out.println(dog1.getName());

    Dog dog2=new Dog("Lucy");
    dog2.setAge(13);

    Dachshund dog3=new Dachshund("Tilly");


    Dog dog4=new Dog("Sophie");
    dog4.Speak();

    ArrayList<Dog> dogs=new ArrayList<Dog>();
    dogs.add(dog1);
    dogs.add(dog2);
    dogs.add(dog3);
    dogs.add(dog4);
    System.out.println("Array");
    for (Dog adog: dogs)
    {
        System.out.println(adog);
        adog.Speak();
    }

    System.out.println(" Pets");
    ArrayList<Pet> pets=new ArrayList<Pet>();
    pets.add(dog1);
    pets.add(dog2);
    pets.add(dog3);
    pets.add(dog4);
    Cat aCat=new Cat();
    pets.add(aCat);
    for (Pet aPet: pets)
    {
        System.out.println(aPet);
        aPet.Speak();

        if (aPet instanceof Dachshund)
        {
            System.out.println("Be careful this dog is fast, it's a Dachshund");
            System.out.println("Top is "+  ((Dachshund)aPet).getSpeed());
        }
    }



}
}
