public class Main {
    Menu menu = new Menu();

    void run() {
        //menu.menu();
        Vacation vacation = new Vacation();
        boolean available =  vacation.checkVacationDate("01/01/22");
        System.out.println("Is requested date open for vacation? " + available);
    }

    public static void main(String[] args) {
        new Main().run();

    }
}