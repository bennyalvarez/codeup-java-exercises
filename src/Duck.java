public class Duck extends Bird {  //this inherits the variables of the Bird class.
    //Duck inherits from Bird
    //Duck inherits all public methods
    //let's override.

    public void makeNoise(){
        System.out.println(this.getName() + " goes Quack Quack!");
    }
}
