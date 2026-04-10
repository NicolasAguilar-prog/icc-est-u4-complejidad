public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int numero = 10;
        int [] arreglo = new int[] { 1 , 2 , 3 , 4 , 5 };
        System.out.println(numero);
        System.out.println(arreglo);

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo [i]);
        }
        for (int i : arreglo){
            System.out.println(i);
        }
    }
}
