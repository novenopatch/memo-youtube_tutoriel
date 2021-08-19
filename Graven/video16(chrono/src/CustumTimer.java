import java.util.Timer;
import java.util.TimerTask;

public class CustumTimer  {
   private Timer timer;
   private int timeInSeconde;
    public CustumTimer(){
        this.timer = new Timer();
        this.timeInSeconde = 10;
    }
    public  void start(backcalll listener){

        listener.onstart();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(timeInSeconde + "s");
                listener.onRun();
                if(timeInSeconde ==0){
                    System.out.println("Stop");
                    listener.onStop();

                    cancel();
                }
                timeInSeconde--;
            }
        }, 1000, 1000);
    }
}
