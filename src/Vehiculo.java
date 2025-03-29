//se crea la interfaz para los vehiculos motorizados

interface VehiculoMotorizado{
    void encender();
    void apagar();

}
// creo la clase abstracta donde agrego los atributos
abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int velMax;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int velMax) {
        this.marca = marca;
        this.modelo = modelo;
        this.velMax = velMax;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelMax() {
        return velMax;
    }
//set con logica de velocidad
    public void setVelMax(int velMax) {
        if (velMax > 0){
            this.velMax = velMax;
        }else {
            System.out.println("Error velocidad no valida");
        }

    }

    public abstract void acelerar(); //Metodo abtracto

    public void MostrarInfo(){
        System.out.println("Vehiculo " + marca + " " + modelo);
        System.out.println("Velocidad Maxima " + velMax + "Km/h");
    }

}
