package OCTUBRE24;

public class Operaciones {

    //ATRIBUTOS
    double num1;
    double num2;
    double suma;




    //metodo constructor, si tiene parametros se pone en los parentesis,

    public Operaciones (double num1,double num2) {
        this.num1 = num1;
        this.num2 = num2;

    }

//----------------------------------------------------------------------------
    // metodo constructor
//    public Operaciones (int num11, int num22){
//        num1 = num11;
//        num2 = num22;
//
//    }



    // metodo constructor no tiene parametros
//    public Operaciones (){
//        num1 = 23;
//        num2 = 56;

//    }

//--------------------------------------------------------------------------------

    //metodo personalizado
    public double Sumar(){
        return num1+num2;
    }

    public double Restar(){
        return num1-num2;
    }

    public void imprimir(){
        System.out.println(" La suma desde el metodo personalizado es: "+ Sumar());
        System.out.println(" La resta desde el metodo personalizado es: "+ Restar());
    }



}
