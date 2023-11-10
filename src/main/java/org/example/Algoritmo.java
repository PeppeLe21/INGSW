package org.example;

import static java.lang.Integer.parseInt;

public class Algoritmo {
    /**
     * Binary Search è un algoritmo di ricerca per trovare la posizione di un
     * elemento in un array ordinato.
     *
     * @param nums Ordered array of numbers
     * @param target Number to be found in the array
     * @return Index of target in nums array, -1 otherwise
     */
    public int binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // target is found
            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        // `target` doesn't exist in the array
        return -1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * Traditional Selection Sort
     *  @param array Array to be sorted
     * @param order Direction to sort the array (0:Ascending, 1:Descending)
     * @return
     */
    public void selectionSort(int[] array, int order) {

        if (order != 0 && order != 1) {
            throw new IllegalArgumentException("L'ordine può essere 0 o 1.");
        }

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                boolean orderCondition = order == 0 ? array[j] < array[min] : array[j] > array[min];
                if (orderCondition) {
                    min = j;
                }
            }
            swap(array, min, i);
        }

        //lilla

    }

    /**
     * Il metodo deve accettare una stringa e convertirla in un numero intero
     * Le stringhe ben formate non contengono caratteri diversi da numeri, spazi finali e meno
     * Il numero rappresentato deve essere compreso nell'intervallo [-32768, 32767], eccezione in caso contrario
     * Non sono ammessi numeri reali
     *
     * @param number
     * @return
     * @throws UnsupportedOperationException
     */
    public int stringToIntConverter(String number) throws UnsupportedOperationException {
        /*int n = 0;
        for (int i = 0; i < number.length(); i++)
        {
            char c = number.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                throw new IllegalArgumentException("L'elemento deve essere un numero");
            }
            n*=10;
            n+=parseInt(String.valueOf(c));
            if(n > 32767 || n <-32767){
                throw new IllegalArgumentException("L'elemento sfora i margini");
            }
        }
        return n;*/
        int numero = 0;
        for(int i = 0; i < number.length(); i++){
            char c = number.charAt(i);
            int n_att = c - '0';
            if(n_att > 9) {
                throw new IllegalArgumentException("Il singolo numero è mmaggiore di 9");
            }
        }
        numero = Integer.parseInt(number);
        if(numero <= -32768 || numero >= 32767){
            throw new IllegalArgumentException("Numero che non rientra nel range prestabilito");
        }
        return numero;
    }

}
