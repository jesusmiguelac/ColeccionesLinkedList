import java.util.LinkedList;

public class colecciones2 {
    public static void main(String[] args) {
        LinkedList coleccion = new LinkedList();
        LinkedList coleccioninv = new LinkedList();
        int ascii = 97;

        System.out.println("Lista original: ");

        for (int i=0; i<10; i++) {
            coleccion.add(i, ((char)(ascii+i)));
            System.out.println(coleccion.get(i));
        }


        System.out.println("");

        System.out.println("Colección inversa: ");

        for (int i = 9; i>=0 ; i--) {
            coleccioninv.add(coleccion.get(i));
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(coleccioninv.get(i));
        }
    }
}