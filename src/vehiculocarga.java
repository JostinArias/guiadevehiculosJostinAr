public class vehiculocarga extends vehiculo {
    private int capacidadCarga;

    public vehiculocarga(String marca, String modelo, int año, int kilometraje, int capacidadcarga){
        super(marca ,modelo , año, kilometraje);
        this.capacidadCarga = capacidadcarga;
    }
    public int getCapacidadCarga(){
        return capacidadCarga;
    }
    public void setCapacidadCarga(int capacidadCarga){
        this.capacidadCarga = capacidadCarga;
    }

    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("capacidad de carga "+ capacidadCarga+ " kg");
    }

}
