package concurrency;

public class Main {
    public static void main(String[] args) {

        Thread th = Thread.currentThread();

        System.out.println(":::"+Thread.currentThread().getName());

        numberPrecess nubp = new numberPrecess(5);

        Thread newTH = new Thread(nubp);

        newTH.start();

    }
}
