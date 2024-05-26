public class vehiculopasajero extends vehiculo {
    private int numPasajeros;

    public vehiculopasajero(String marca, String modelo, int año, int kilometraje,int numPasajeros){
        super(marca,modelo,año,kilometraje);
        this.numPasajeros = numPasajeros;
        
    }

    public int getNumpasajeros(){
        return numPasajeros;
    }

    public void setPasajeros(int numPasajeros){
        this.numPasajeros = numPasajeros;
    }

   
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("capacidad de carga "+ numPasajeros);
    }


}
