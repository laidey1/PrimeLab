
public class PrimeLab {

	public static boolean isPrime(int number) {
		//	for (int i =2; i <= number/2; ++i ) {
		//		if (number % 1 ==0) {
		//			return true;{
		//		
		//		} else if (number % 1 !== 0) 
		//		{
		//			return false;
		//		}

		if(number <= 1) {
			return false;
		}

		for(int i =2; i< number; i++) {
			if(number % i ==0) {
				return false;
			}
		}

		return true;


	}
	public static void main(String[] args) {
		//		
		//		for (int i=1;  i<= 100;i++) {
		////			System.out.println( "Is" + i + "prime?");
		////			System.out.println(isPrime(i));
		//			if(isPrime(i)){
		//			System.out.println(i);
		//		
		for (int i=1900; i<= 2100; i++) {
			if(isPrime(i) && isPrime(i - 4)) {
				System.out.println(i);
			}

		}

	}
}