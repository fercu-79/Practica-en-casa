public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int x = 6;
        int y = 3;
        int z = x + y;

        runCalculation(z);
        System.out.println("Calculo completo correctamente: " + z);
    }
    
    public static void runCalculation(int valor) {
        System.out.println("Procesando el valor dentro del método: " + valor);
    }
}


