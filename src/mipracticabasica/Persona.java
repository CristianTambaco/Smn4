package mipracticabasica;

public class Persona {

    //Atributos
    int anio = 2024;
    int anioNacimiento = 1000;




    //Metodo Constructor

    public Persona(int anio, int anioNacimiento){
        this.anio = anio;
        this.anioNacimiento = anioNacimiento;

    }



    //Metodo personalizado


    public int imprimirEdad(){
        return anio-anioNacimiento;

    }

    public boolean verificarMayorDeEdad(int edad) {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }


    public void mostrarResultados(){
        System.out.println("La edad es: "+imprimirEdad());


    }



}
