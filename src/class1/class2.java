package class1;

public class class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //F(n) = F(n-1) + F(n-2)
		
		System.out.println(ChislaFibonachi(2)); ;
					}
	public static int ChislaFibonachi(int n) {
		if(n <=0 ) {
			return 0;
		}else if (n==1) {
			return 1;
		}
		return ChislaFibonachi(n - 1 ) + ChislaFibonachi(n - 2);
	}
}
  
