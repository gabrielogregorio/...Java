public class Interface {
		// interfaces funcionais
		interface Num {
			double getValue();
		}
		
		public static void main(String[] args) {
			Num n = () -> 333.11; 
			System.out.println( n.getValue() );
		
	}
}
