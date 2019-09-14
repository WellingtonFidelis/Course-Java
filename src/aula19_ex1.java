
public class aula19_ex1 {

	public static void main(String[] args) {
	
		int[] A = new int[5];
		int[] B = new int[5];
		
		A[0]=10;
		A[1]=11;
		A[2]=12;
		A[3]=13;
		A[4]=14;
		
		System.out.println("Valores do Array B: ");
		for (int i=0; i < B.length; i++) {
			System.out.println(B[i]);			
		}
		
		System.out.println("Valores do Array B: ");
		for (int i=0; i < A.length; i++) {			
			B[i]=A[i];
			System.out.println(B[i]);
		}
		
	}

}
