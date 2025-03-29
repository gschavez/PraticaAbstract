class Carro extends Vehiculo implements VehiculoMotorizado{
    public Carro(String marca, String modelo, int velMax) {
        super(marca, modelo, velMax);
    }

    @Override
    public void acelerar() {
        System.out.println("El carro " + getMarca() + " acelera suavemente");
    }

    @Override
    public void encender() {
        System.out.println("El auto "+ getMarca() + " esta encendido");
    }

    @Override
    public void apagar() {
        System.out.println("El auto " + getMarca() + " Esta apagado");
    }
}
