public class Main {

    void run(){
        System.out.println("Hello world!");
        Menu menu = new Menu("Velkommen til Harrys Salon bookingapplikation", "Vælg input",
                new String[]{"1 . Book tid"});

        boolean inputIsInt;
        do {
            menu.printMenu();
            switch (menu.readInput()) {
                case 1:
                    System.out.println("Du har valgt 1.");
                    inputIsInt = true;
                    break;
                default:
                    System.out.println("Indtast venligst et tal fra menupunktet.");
                    inputIsInt = false;
                    break;
            }
        } while (!inputIsInt);
    }
    public static void main(String[] args) {
         new Main().run();

    }
}