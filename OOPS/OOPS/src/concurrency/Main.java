package concurrency;

public class Main {
    public static void main(String[] args) {

        Thread th = Thread.currentThread();

        System.out.println(":::"+Thread.currentThread().getName());

        for(int i =0 ; i <100 ;i++){
            numberPrecess nubp = new numberPrecess(i);

            Thread newTH = new Thread(nubp);

            newTH.start();
        }


    }
}
