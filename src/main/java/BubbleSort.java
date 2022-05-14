import java.util.ArrayList;

public class BubbleSort {

    public static void main(String[] args) {
        //Ordenando un array
        int[] array = new int[5];

        array[0] = 2;
        array[1] = 1;
        array[2] = 4;
        array[3] = 3;
        array[4] = 5;

        System.out.println("Arreglo desordenado");
        mostrarArray(array);


        ordenarMenorAMayor(array);

        System.out.println("Arreglo ordenado de menor a mayor");
        mostrarArray(array);

        ordenarMayorAMenor(array);

        System.out.println("Arreglo ordenado de mayor a menor");
        mostrarArray(array);

        // Ordenando una lista / ArrayList
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(2);
        lista.add(1);
        lista.add(4);
        lista.add(3);
        lista.add(5);

        System.out.println("Lista desordenada");
        mostrarArrayList(lista);

        ordenarListaMenorAMayor(lista);

        System.out.println("Lista ordenada de menor a mayor");
        mostrarArrayList(lista);

        ordenarListaMayorAMenor(lista);

        System.out.println("Lista ordenada de mayor a menor");
        mostrarArrayList(lista);

    }

    public static void mostrarArray(int[] array){
        for(int i = 0; i < array.length ; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("\n\n");
    }

    public static void mostrarArrayList(ArrayList<Integer> arrayList){
        for(int i = 0; i < arrayList.size() ; i++){
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println("\n");
    }

    public static void ordenarMenorAMayor(int[] array){
        for(int i = 0; i < array.length-1 ; i++){
            for(int j = 0; j < array.length-1 ; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void ordenarListaMenorAMayor(ArrayList<Integer> lista){
        for(int i = 0; i < lista.size()-1 ; i++){
            for(int j = 0; j < lista.size()-1 ; j++){
                if( lista.get(j) > lista.get(j+1) ){
                    int temp = lista.get(j);
                    lista.set(j , lista.get(j+1) );
                    lista.set(j+1 , temp );
                }
            }
        }
    }

    public static void ordenarListaMayorAMenor(ArrayList<Integer> lista){
        for(int i = 0; i < lista.size()-1 ; i++){
            for(int j = 0; j < lista.size()-1 ; j++){
                if( lista.get(j) < lista.get(j+1) ){
                    int temp = lista.get(j);
                    lista.set(j , lista.get(j+1) );
                    lista.set(j+1 , temp );
                }
            }
        }
    }

    public static void ordenarMayorAMenor(int[] array){
        for(int i = 0; i < array.length-1 ; i++){
            for(int j = 0; j < array.length-1 ; j++){
                if(array[j] < array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

}
