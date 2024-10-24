package OCTUBRE24;

public class Main {


    public static void main(String[] args){

//-------------------------------------------------------------------
        //imprimir primera forma

        Operaciones suma1 = new Operaciones(3.0,8.0);  //<-- <-- <-- instanciar o crear objeto

        suma1.Sumar();
        System.out.println("La suma es "+ suma1.Sumar());

        suma1.Restar();
        System.out.println("La resta es "+ suma1.Restar());

//------------------------------------------------------------

        //imprimir segunda forma desde el metodo personalizado


    //--    Operaciones suma1 = new Operaciones(3.0,8.0);    //<-- <-- <-- instanciar o crear objeto

    //--    suma1.imprimir();

//---------------------------------------------------------------

    }


}
