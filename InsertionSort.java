import java.util.Arrays;
class InsertionSort {
  public static void sort(int[] array) {
   for (int i = 1; i < array.length; i++) {
     int current = array[i];
     int j = i -1;
     //Para ordenar de forma descendente cambiariamos la condicion a <
     while (j >= 0 && array[j] > current) {
      //Primer loop explicado:
      //array[1] = array[0] (7)
       array[j+1] = array[j];
       //j=-1-> salimos del bucle
       j--;
     }
     //array[-1+1] = current(2)
     array[j+1] = current;
     
   }
  }
  public static void main(String[] args) {
    int[] numbers = {7,2,14,-7,72};
    System.out.println("Array in ascending order");
    sort(numbers);
    System.out.println(Arrays.toString(numbers));
  }
}