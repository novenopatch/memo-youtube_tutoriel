import jc.entities.*;
//elle m'a narguer a propos de la cuisine 8 juin 2020 19:46
public class App{
    public static void main(String[]args){
        Horse h = new Horse("Guero");
        h.move(167,428);

        Pegasus p = new Pegasus("Titanus");
        p.move(33, 146);
        p.fly(466);
    } 
}