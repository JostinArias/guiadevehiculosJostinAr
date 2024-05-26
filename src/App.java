public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        Auto auto = new Auto("nissan", "Supra", 2015, 15000, 5, "gasolina");

        camion camion = new camion("kendwork", "t900", 2010, 75000, 20000, 6);

        System.out.println("Información del auto");
        auto.mostrarInfo();
        
        System.out.println("informacion del camion ");
        camion.mostrarInfo();
    }
}
