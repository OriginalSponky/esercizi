import java.util.Scanner;

public class ES22 {
    public static void main(String[] args){
        //inizializzop le variabili
        int n,Numero = 0,somma=0;
        Scanner Input = new Scanner(System.in);
        //metto in input la quantià di numeri che vuole inserire l'utente
        n= Input.nextInt();
        //uso u cliclo for per ripetere il calcolo n volte
        for (int i = 0; i < n; i++) {
            //metto in input il numero che inserisce l'utente
            Numero= Input.nextInt();
            //controllo se è minore di 0: se è minore di zero tolgo di uno il contatore, senò sommo il numero con la somma
            if(n<0){
                i-=1;
            }else{
                somma=somma+Numero;
            }


        }
        //metto in output la media
        System.out.println("La media è:"+(somma/n));
    }
}
