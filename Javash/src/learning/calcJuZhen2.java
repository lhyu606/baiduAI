
public class calcJuZhen2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double a[][] = new double[2][2];
		double b[][] = new double[2][2];
		int N = a.length;
		int base = 1;
		double c[][] = new double[N][N];
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				a[i][j] = base++;
				b[i][j] = base;
				//计算行 i 和 j 的点乘
				for(int k=0;k<N;k++){
					c[i][j] += a[i][k]*b[k][j];
					System.out.println("c["+i+"]["+j+"] += a["+i+"]["+k+"]*b["+k+"]["+j+"];");
					if(k == 1){
						System.out.println("- - - - - -c["+i+"]["+j+"] = a["+i+"]["+k+"]*b["+k+"]["+j+"];");
					}
					
				}
			}
		}
		System.out.println(c[1][1]);
	}

}
