package estrategia;


public class InsertionSort implements AlgoritimoOrd {
    public int[] ordernar(int[] array) {//aqui vai ser chamado a variavel de entrada da interface

        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
            	array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
        return array;
    }

}
