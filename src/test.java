
public class test {


    public static void main(String[] args) {
        Person p1 = new Person("Benny");
        Person p2 = new Person();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName())); //true because name fields "John" are the same.
//        System.out.println(person1 == person2); //two different objects: person1 vs person 2

//        Person person1 = new Person("John");
//        Person person2 = person1;  //set it to person1
//        System.out.println(person1 == person2);

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName()); //why is line: 23 and 24 both "Jane."


    }

}
