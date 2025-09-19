package estrategia;


public class BubbleSort implements AlgoritimoOrd {


		@Override
		public int[] ordernar(int[] array) { //aqui vai ser chamado a variavel de entrada da interface
	        int n = array.length;

	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (array[j] > array[j + 1]) {
	                    int temp = array[j];
	                    array[j] = array[j + 1];
	                    array[j + 1] = temp;
	                }
	            }
	        }
	        return array;
		}
}
