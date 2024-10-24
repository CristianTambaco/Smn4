package calificaciones;

public class Notas {

    //Atributos
    double nota1;
    double nota2;

    //metodo constructor
    public Notas(double nota1, double nota2){
        this.nota1 = nota1;
        this.nota2 = nota2;

    }

    public double promedio(){
        return (nota1+nota2)/2;
    }

    public void notaA(){
        System.out.println("Promedio");
    }




}
