package org.ejercicio.banco;

public class Main {
    public static void main(String[] args){
        Cliente cliente1= new Cliente("Eduardo",23874328);
        CuentaBancaria cuenta1 = new CuentaBancaria(2834634,cliente1,10000);

        Cliente cliente2 = new Cliente("LUis Goméz",2384973);

        CuentaBancaria cuenta2 = new CuentaBancaria(123,new Cliente("Juan Gomez",2343523),12000);

    }

}