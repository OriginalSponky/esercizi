import java.util.Scanner;

public class ES28 {
    public static void main(String[]args){
        //Inizializo le variabili
        int mesi,h;
        Scanner Input = new Scanner(System.in);
      //metto in input la quantità di mesi
        mesi=Input.nextInt();
        //metto in input l'altezza iniziale della pianta
        h=Input.nextInt();
        //inizializo la creascita della pianta che fà al mese
        int crescita=h/2;
        //uso un ciclo for per calcolare l'altezza finale
        for (int i = 0; i < h; i++) {
            h=h+crescita;
            crescita=crescita/2;
        }
//metto in output l'altezza finale
System.out.println(h);



    }
}
