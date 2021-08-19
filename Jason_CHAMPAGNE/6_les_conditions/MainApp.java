
/*

&& ET
|| OU
!  inverse

*/



public class MainApp {
    public static void main(String []args)
    {
        int gra = 24;
        int option =1;
        if(gra==23)
        {
            System.out.println("ddddddddddd");
        };

        if(gra==3)
            System.out.println("mjjjjd");//acolad dipensable pour instruction sur une ligne

        else if (gra<103)
            System.out.println("mjjjjd");

        else
            System.out.println("grrrr");

        switch(option)//l'avantage c'est que l'on peut tester des string case "u" sinon si l;
        {
            case 10:{
                System.out.println("grrrr");
                break;
            }
            case 30:
                {
                    System.out.println(option);
                    if (10> option && option <25)
                        System.out.println("test reussi option= "+option);
                    else
                        {
                            System.out.println("test non reussi option= "+option);
                        }


                    break; 
                }
                
            default:
            {
                System.out.println("nnnnnnnnnnnnnnnnnnnnnnnnnn");
                break;
            }
               

        }




    }
    
}