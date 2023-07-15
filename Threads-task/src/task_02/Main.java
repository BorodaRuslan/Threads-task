package task_02;

// Виводяться фрукти, потім овочі
public class Main {

    public static void main(String[] arg) throws InterruptedException {

        Fruits fruits = new Fruits();
        fruits.start();
        fruits.join();

        showVeges(getVeges());
    }

    private static String[] getVeges() {
        return new String[]{"tomato", "cucumber", "carrot"};
    }

    private static void showVeges(String [] arr) {
        for (String veg : arr) System.out.println(veg);
    }
}
