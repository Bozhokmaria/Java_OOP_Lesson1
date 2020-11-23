package task3;

public class Main {
    public static void main(String[] args) {
        Computer [] computers = new Computer[5];
        
        for (int i = 0; i < 5; i++) {
            computers[i] = new Computer();

            computers[i].setModel("12345");
            computers[i].setProducer("Samsung");
        }

        for (Computer computer: computers) {
            System.out.println(computer);
        }
        
    }
}
