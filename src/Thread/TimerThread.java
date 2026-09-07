package Thread;

public class TimerThread implements Runnable{

    @Override
    public void run(){
        for (int i=0;i<5;i++){
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e);
            }
            if(i==4){
                System.out.println("Times up!");
                System.exit(0);
            }
        }
    }
}
