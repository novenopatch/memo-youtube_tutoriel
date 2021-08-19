public class Main {
    public static void main(String[]args){

        CustumTimer timer = new CustumTimer();
        timer.start(new backcalll() {
            @Override
            public void onstart() {
                System.out.println("Lancement du chrono");
            }

            @Override
            public void onRun() {
                System.out.println("Loding....");

            }

            @Override
            public void onStop() {
                System.out.println("Finish....");

            }
        });
        
    }
}
