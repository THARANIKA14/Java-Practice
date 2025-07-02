interface Serializable {
      
}

class Person implements Serializable {
    public Person() {
        System.out.println("Person object created");
    }
}

class Animal {
    public Animal() {
        System.out.println("Animal object created");
    }
}

public class MarkerInterface 
{
    public static void main(String[] args) 
    {
        Person person = new Person();
        Animal animal = new Animal();

        if (person instanceof Serializable)
            System.out.println("Person is serializable");
        else 
            System.out.println("Person is not serializable");
       

        if (animal instanceof Serializable)
            System.out.println("Animal is serializable");
        else
            System.out.println("Animal is not serializable");

    }
}
