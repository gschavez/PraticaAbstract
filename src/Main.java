public class Main {
    public static void main(String[] args) {
        Carro auto1 = new Carro("Audi","R8",300);

        Moto moto1 = new Moto("Zuzuki","Gixxer",230);
        //el progrema es bastante basico pero muestra como usa las clases abstractas para definir
        //los atributos comunes en los vehiculos; y la interfaz que obliga a los vehiculos motorizados
        //a usar los metodos de encender acelerar apagar.

        auto1.MostrarInfo();
        auto1.encender();
        auto1.acelerar();
        auto1.apagar();
        System.out.println(" ");
        moto1.MostrarInfo();
        moto1.encender();
        moto1.acelerar();
        moto1.apagar();



    }
}