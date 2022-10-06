public class Main {
    Menu menu = new Menu();

    void run() {
        do {
            menu.menu();
        } while (!menu.quitSystem);

    }

    public static void main(String[] args) {
        new Main().run();

    }
}