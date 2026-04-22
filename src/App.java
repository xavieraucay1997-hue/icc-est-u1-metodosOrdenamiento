public class App {
    public static void main(String[] args) {
        metodoBurbuja();
        MetodoBurbujaAvanzado(); 
        runSeleccion(); 

    }
    public static void runSeleccion() {
        MetodoSeleccion mSeleccion = new MetodoSeleccion(); 
        int[] arr = new int []{1,10,7,9,0,1,3,4}; 
        mSeleccion.printArreglo(arr);
        mSeleccion.sort(arr); 
        mSeleccion.printArreglo(arr); 
        mSeleccion.sortDes(arr); 
        mSeleccion.printArreglo(arr); 

    }



    public static void metodoBurbuja(){
        System.out.println("Metodo Burbuja");
        int[] arreglo = new int[]{10, -5,0,2,7};
        MetodoBurbuja metodoBurbuja = new MetodoBurbuja(arreglo);
        metodoBurbuja.imprimirArreglo();
        metodoBurbuja.ordenarAscendente();
        metodoBurbuja.imprimirArreglo();
        metodoBurbuja.ordenarDescendente(); 
        metodoBurbuja.ImprimirArreglo();
    

    }

    public static void MetodoBurbujaAvanzado(){
        System.out.println("Metodo Avanzado");
        int[] arreglo = new int[]{50,5,20,30,0,-10,15}; 
    //instanciar la clase
        MetodoBurbujaAvanzado mBurbujaAvanzado = new MetodoBurbujaAvanzado(arreglo); 
        System.out.println("Ascendente");
        mBurbujaAvanzado.printArreglo(); 
        mBurbujaAvanzado.sort(true );
        System.out.println("Decendente");
        mBurbujaAvanzado.printArreglo(); 
        mBurbujaAvanzado.sort(false);
        mBurbujaAvanzado.printArreglo();
    }
}


