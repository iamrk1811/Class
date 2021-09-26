package ThreadTest;

public class RoumitaThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Roumita : " + i);
        }
    }
}
