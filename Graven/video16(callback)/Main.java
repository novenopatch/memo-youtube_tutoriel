public class Main{
    public static void main(String[] args){
        substract(10,4, new CalculListener(){
            @Override
            public void onPositive(){
                System.out.println("p");
            }
            @Override
            public void onNegative(){
                System.out.println("n");
            }
        });
    }
    public  static void substract(int a , int b, CalculListener listener){
        int result = a - b;
        System.out.println("le resulta de la soustraction est :" + result);
        if(result > 0){
            System.out.println("positive");
            listener.onPositive();
        }
        else{
            System.out.println("negative");
            listener.onNegative();
        }
    }
    //Main.java
}