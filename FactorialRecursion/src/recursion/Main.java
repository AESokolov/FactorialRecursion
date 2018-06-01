package recursion;
        public class Main {
	           public static int fact(int n) {
	                  if(n == 1) return 1;
		              if(n == 2) return 2;
		                         return fact(n-1)*n;
	}
	public static void main(String[] args) {
	             //recursion
				 int res = fact(5);
				 System.out.println("res = " + res);
	}
}

