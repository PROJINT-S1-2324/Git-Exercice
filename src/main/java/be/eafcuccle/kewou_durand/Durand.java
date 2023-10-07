package be.eafcuccle.kewou_durand;

public class Durand {
    public static void main(String[] args) {
        int nombre1 = 5;
        int nombre2 = 7;
        int somme = ajouter(nombre1, nombre2);
        System.out.println("La somme de " + nombre1 + " et " + nombre2 + " est : " + somme);
    }

    public static int ajouter(int a, int b) {
        return a + b;
    }
}

