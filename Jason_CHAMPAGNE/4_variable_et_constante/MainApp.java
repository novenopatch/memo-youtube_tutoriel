/*
    -Pas de caratere speciaux, pas d'espaces
    -Commence par une lettre ou underscore(_)
    uneVariableUnPeuLongue (camel case)
    UneVarialeUnPeuLongue (pascal case)
    une_variable (snake case)
*/

public class MainApp {
    public static void main (String[]agrs)
    {
        int bolo;
        bolo = 123_456_78;
        int ageUtilisateur =0;
        System.out.println(ageUtilisateur);

        ageUtilisateur = bolo + ageUtilisateur;
        System.out.println(ageUtilisateur);

        final int NBR = 3;
        System.out.println(NBR);
        

    }
    
}