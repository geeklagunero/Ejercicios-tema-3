public class Principal {

    public static void main(String[] args) {
        suma(1, 2, 3);

        Coche coche = new Coche();
        coche.incrementarPuertas();
        coche.incrementarPuertas();
        System.out.println("el coche tiene " + coche.numeroPuertas + " Puertas");
    }

    public static void suma(int a, int b, int c){
        int suma = a + b + c;
        System.out.println("La suma es: " + suma);
    }
}
