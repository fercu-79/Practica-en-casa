public class App {
    public static void main(String[] args) throws Exception {

        int[] numeros = {10, 20, 30, 40};
        int sumaTotal = 0;


    for (int i = 0; i < numeros.length; i++) {
            sumaTotal = sumaTotal + numeros[i];
        }

        System.out.println("La suma de todo el arreglo es: " + sumaTotal);
    }
}