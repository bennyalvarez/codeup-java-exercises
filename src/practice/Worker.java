package practice;

public class Worker {    //this is the class
    String workerName;
    int workerID;

    void setDetails(String name, int id) {
        workerID = id;
        workerName = name;
    }

    void displayDetails() {
        System.out.println(workerID);
        System.out.println(workerName);
    }

    public static void main(String[] args) {
        Worker wrk1 = new Worker();  //creating new object. () is the constructor
        wrk1.setDetails("Deepak", 12345);
        wrk1.displayDetails();

        int [][] numberArr = new int[3][2];
        numberArr[0][0] = 10;
        numberArr[0][1] = 20;
        numberArr[1][0] = 30;
        numberArr[1][1] = 40;
        numberArr[2][0] = 50;
        numberArr[2][1] = 60;

        for (int i = 0; i < 3; i++) { //outer loop if for rows
            for (int j = 0; j < 2; j++){ //inner loop is for columns
                System.out.print(numberArr[i][j] + " "); //using sout print so it appears on same line.
            }
            System.out.println(" ");
        }
    }
}
