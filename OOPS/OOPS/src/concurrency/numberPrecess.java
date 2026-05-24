package concurrency;

public class numberPrecess implements Runnable{
    int i ;

    public numberPrecess(int a){
        this.i=a;
    }

    //@Override
    public  void run(){
        System.out.println("custome Thread::::"+ Thread.currentThread().getName() +"print number i ="+1);
    }
}
