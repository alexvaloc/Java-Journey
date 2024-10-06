import java.util.Arrays;

public class MergeSort {
    //Algoritmo de Merge sort se divide en dos fases:
    //Sort: Separamos todos los elementos cada uno en un array
    //Merge: volvemos a fusionar todos los arrays en uno solo

    public int[] sort(int[] arr) {
        int length = arr.length;
        //Base case:
        if (length <= 1) {
            return arr;
        }
        //Revursive case: 
        int mid = Math.floorDiv(length, 2);
        int[] leftArray = Arrays.copyOfRange(arr, 0, mid);
        int[] rightArray = Arrays.copyOfRange(arr, mid, length);
        //Para cada sub-array, llamamos a sort y a merge: 
        return merge(sort(leftArray), sort(rightArray));
    }

    public int[] merge(int[] left, int[] right) {
        //Creamos un array donde guardaremos nuestro array ordenado, con el length de nuestros sub-arrays. 
        int[] merged = new int[left.length + right.length];
        //Indice izquierdo, derecho e indice actual: 
            int leftPos = 0;
            int rightPos = 0;
            int curIndex = 0;
        //Mientras el indice dcho e izq sean menores a la longitud del array:
        while(left.length > leftPos && right.length > rightPos){
        //Comparamos los indices menores de cada array y el menor se coloca en merged. Aumentamos los índices en cada iteración. 
          if(left[leftPos] < right[rightPos]){
            merged[curIndex] = left[leftPos];
            leftPos++;
          }else{
            merged[curIndex] = right[rightPos];
            rightPos++;
          }
          curIndex++;
        }
        //Terminamos de colocar los números restantes del array izq y dcho al finalizar las comparaciones:
        /*
        1 - source array
        2 - starting position in the source array
        3 - destination array
        4 - startig position of the destination data
        5- number of array elements to be copied
        */
        System.arraycopy(left,leftPos,merged,curIndex,left.length-leftPos);
        System.arraycopy(right,rightPos,merged,curIndex,right.length-rightPos);
        return merged;
    }


    public static void main (String[] args) {

        int[] inputArr = {3,5,2,90,4,7};
        MergeSort sorter = new MergeSort();
        System.out.println(Arrays.toString(sorter.sort(inputArr)));
    }
}