import java.util.Comparator;

public class PriceComparator implements Comparator<Toy> {
    @Override
    public int compare(Toy toy1, Toy toy2) {
        /*
        if(toy1.getPrice() < toy2.getPrice()){
            return -1;
        }
        else {
            return 1;
        }
            //identique au return fait en bas
         */
       // return toy1.getPrice() - toy2.getPrice();
        //dans le cas ou il aurait le meme pris on compare par odre alphabétique
        if(toy1.getPrice() == toy2.getPrice()){
            //return  toy1.getName().compareTo(toy2.getName());
            toy1.compareTo(toy2);
        }
        return toy1.getPrice() - toy2.getPrice();
    }
}
