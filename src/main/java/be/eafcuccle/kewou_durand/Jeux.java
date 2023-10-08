package be.eafcuccle.kewou_durand;

public class Jeux {
    public static void main(String[] args) {
        int nombre1 = 5;
        int nombre0 = 5;
        int nombre2 = 7;
        int somme = veuxjouter(nombre1, nombre2 ,nombre0 );
        System.out.println("La somme de " + nombre1 + " et " + nombre2 + " est : " + somme);
    }

    public static int veuxjouter(int a, int b,int c) {
        return a + b +c;
    }
}

