public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        Auto auto = new Auto("nissan", "Supra", 2015, 15000, 5, "gasolina");

        camion camion = new camion("kendwork", "t900", 2010, 75000, 20000, 6);

        System.out.println("Información del auto");
        auto.mostrarInfo();
        
        System.out.println("informacion del camion ");
        camion.mostrarInfo();

        System.out.println("mantenimiento del auto chele ");
        auto.realizarMantenimiento();
        double costoMantenimiento = auto.calcularCostoMantenimiento(0.5, 500);
        System.out.println("El costo de mantenimiento del auto es: $" + costoMantenimiento);

        System.out.println("mantenimiento del camion ");
        camion.realizarMantenimiento();

        //profe se me había olvidado que había que ponerle QA a la rama se me fue el avión pero lo importante es que se entendió la idea
   
    }
}
