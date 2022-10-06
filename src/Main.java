public class Main {
    Menu menu = new Menu();

    void run() {
        //menu.menu();
        Vacation vacation = new Vacation();
        vacation.checkDate("01/12/22");
    }

    public static void main(String[] args) {
        new Main().run();

    }
}