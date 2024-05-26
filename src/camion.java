public class camion extends vehiculocarga {

    private int numEjes;

    public camion(String marca, String modelo, int año, int kilometraje, int capacidadCarga, int numEjes){
        super(marca, modelo, año, kilometraje, capacidadCarga);
        this.numEjes = numEjes;
    }

    public int getNumEjes(){
        return numEjes;
    }

    public void estNumEjes(int numEjes){
        this.numEjes = numEjes;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("numero de ejes: "+ numEjes);
    }

    
}
