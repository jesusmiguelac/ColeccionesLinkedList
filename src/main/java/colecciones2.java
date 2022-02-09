import java.util.LinkedList;

public class colecciones2 {
    public static void main(String[] args) {
        LinkedList coleccion = new LinkedList();
        LinkedList coleccioninv = new LinkedList();

        System.out.println("Los números generados son: ");

        for (int i = 0; i < 10; i++) {
            coleccion.add((int) (Math.random() * 101));
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