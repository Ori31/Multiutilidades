import java.util.*;;

public class Ordenar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> ListaNumeros = new ArrayList<>();

        System.out.println("Hola yo del futuro");

        System.out.println("Ingresa la cantidad de numeros q planeas usar ");

        int cantidad = input.nextInt();

        for (int i = 0; i < cantidad; i++) {
            int num;
            System.out.println("Introduce el numero " + (i + 1));
            num = input.nextInt();
            ListaNumeros.add(num);
        }

        Collections.sort(ListaNumeros);
        System.out.println("Los numeros ordenados son :");

        for (Integer integer : ListaNumeros) {
            System.out.print(integer + " ");
        }

    }
}