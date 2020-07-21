package test;
//Loop Test
public class T8 {
	public static void main(String[] args) {
		int[] num= {1,2,3,};
		String [] name= {"John","Nick","Lucas"};
		for(int x : num) {
			System.out.print(x+",");
		
		}
		System.out.print("\n");
		for(String x : name) {
			System.out.print(x+",");
		}
	}

}
