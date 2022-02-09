import java.util.LinkedList;
import java.util.Comparator;

public class colecciones {

    public static void main(String[] args) {
        LinkedList coleccion = new LinkedList();

        float suma = 0;
        float promedio = 0;

        System.out.println("Los números generados son: ");

        for (int i=0; i<25; i++){
            coleccion.add((int)(Math.random()*101));
            System.out.println(coleccion.get(i));
        }

        coleccion.sort(Comparator.naturalOrder());

        System.out.println("");

        System.out.println("Números ordenados: ");

        for (int i=0; i<25; i++){
            System.out.println(coleccion.get(i));
        }

        for (int i=0; i<25; i++){
            suma += ((int)coleccion.get(i));
        }

        promedio = suma/25;

        System.out.println("La suma de los números es: "+suma);
        System.out.println("El promedio de los números es: "+promedio);
    }
}
