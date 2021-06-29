package practice;

class JuniorProgrammer {
    int salary = 2000;
    JuniorProgrammer(int salary){
        this.salary = salary;
    }
    void display() {
        System.out.println("This is class Junior");
    }
}

public class SeniorProgrammer extends JuniorProgrammer {
    int salary = 5000;
    SeniorProgrammer(int salJunior, int salSenior){
        super(salJunior);
        salary = salSenior;
    }
    void display(){
        System.out.println(salary + " " + super.salary);
    }
    void Hi(){
        display();      //method calls display of child class "This is class Senior"
        super.display();  //method calls display of parent class "This is class Junior"
    }

    void displaySalaries(){
        System.out.println("Junior Programmer Salary : " + super.salary); //means salary of the parent class Junior
        System.out.println(("Senior Programmer Salary : " + salary)); //means salary of the child class
    }

    public static void main(String[] args) {
        SeniorProgrammer obj = new SeniorProgrammer(5000,10000);
        obj.display();
        obj.displaySalaries();
        obj.Hi();
    }
}
