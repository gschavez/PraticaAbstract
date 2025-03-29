class Moto extends Vehiculo implements VehiculoMotorizado{

    public Moto(String marca, String modelo, int velMax) {
        super(marca, modelo, velMax);
    }

    @Override
    public void acelerar() {
        System.out.println("La Moto " + getMarca() + " Acelera rapidamente");
    }

    @Override
    public void encender() {
        System.out.println("la moto " + getMarca() + " esta encendida");
    }

    @Override
    public void apagar() {
        System.out.println("La moto " + getMarca() + " esta apagada");
    }

}
