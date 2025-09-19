package estrategia;



public class Principal {
	
	public static void main (String [] args) {
		int [] array = {3, 5, 2, 1, 100, 7};
		Ordenador ordenador = new Ordenador();
		InsertionSort insertionSort = new InsertionSort();
		BubbleSort bubbleSort = new BubbleSort();
		ContextOrd contextOrd = new ContextOrd();
		
		ordenador.realizaOrdenacao(array, bubbleSort);
		ordenador.realizaOrdenacao(array, insertionSort);
		
	}
}
