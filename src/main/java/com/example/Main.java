package com.example;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hello world!");

        byte edad = 25; 
        short codigoPostal = 12345; 
        double salario = 3500.00;
        String nombre = "CamiloGalvis";
        boolean esMayorDeEdad = true;

        //Autoboxing byte 
        byte edadObj = edad;
        
        //Ounboxing byte
        byte edadPrimitivo = edadObj;

        //Autoboxing double
        double salarioObj = salario;
        System.out.println(nombre.toString());


        //Casteo de datos 
        int salarioEntero = (int)salario;

        System.out.println(salarioEntero);

        long codigoPostalLargo = (long) codigoPostal;

        System.out.println(codigoPostalLargo);
        //Lo que sucedio fue que hubo unos cambios en el almacenamiento de datos 



        //Parseo de datos 
        String numeroStr = "12345678";
        int numeroInt = Integer.parseInt(numeroStr);

        String decimalStr = "3.14159";
        double decimalValor = Double.parseDouble(decimalStr);

        System.out.println(numeroInt + decimalValor);










        



    }
}