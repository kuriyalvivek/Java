package concurrency;

public class numberPrecess implements Runnable{
    int i ;

    public numberPrecess(int a){
        this.i=a;
    }

    @Override
    public  void run(){
        System.out.println("::::th name = "+ Thread.currentThread().getName() +"::print number i ="+i);
    }
}
