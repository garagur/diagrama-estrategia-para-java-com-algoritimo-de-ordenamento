package estrategia;
//ORDENADOR vai ser a funcao que imprime os valores 
public class Ordenador {
public void realizaOrdenacao(int[] array, AlgoritimoOrd algoritimoOrd) {
int[] vetor = algoritimoOrd.ordernar(array);
for (int valor : vetor) {
	System.out.print(valor+" - ");
}
}
}