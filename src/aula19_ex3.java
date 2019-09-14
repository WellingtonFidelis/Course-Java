
public class aula19_ex3 {

	// declaration of variables globals and static
		public static void main(String[] args) {
			// declaration of variables locals and constants
			int[] A = new int[15];
			int[] B = new int[15];
			
			// input data
			
			// data processing
			for (int i=0; i < A.length; i++) {
				A[i] = i;
			}
			for (int i=0; i < B.length; i++) {
				B[i] = (int) Math.pow(A[i],2) ;
			}

			// output data
			for (int i=0; i < B.length; i++) {
				System.out.println("Vetor B, índice " + i + " valor: " + B[i]);
			}
		}
}
