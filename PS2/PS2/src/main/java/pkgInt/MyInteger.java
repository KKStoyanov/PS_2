package pkgInt;

public class MyInteger {
	
	//declaration of iValue int.
	private int iValue;
	
	//Constructor of MyInteger.
	public MyInteger(int iValue) {
		super();
		this.iValue = iValue;
		setiValue(iValue);
	}
	
	//Getters and Setters.
	public int getiValue() {
		return iValue;
	}

	public void setiValue(int iValue) {
		this.iValue = iValue;
	}
	
	//This function returns true or false depending on whether iValue is even.
	public boolean isEven(){
		if(getiValue() % 2 == 0)
			return true;
		else 
			return false;
	}
	
	//This function returns true or false depending on whether iValue is odd.
	public boolean isOdd(){
		if(getiValue() % 2 != 0)
			return true;
		else 
			return false;
	}
	
	//This function returns true or false depending on whether iValue is prime.
	public boolean isPrime(){
		for(int i = 2; i < getiValue() / 2; i++){
			if (getiValue() % i == 0)
				return false;
		}
		return true;
	}
	//isEven(int x), isOdd(int x), and isPrime(int x) are pretty much identical to the functions above, but these are static methods
	public static boolean isEven(int x){
		if(x % 2 == 0)
			return true;
		else 
			return false;
	}
	
	public static boolean isOdd(int x){
		if(x % 2 != 0)
			return true;
		else 
			return false;
	}
	
	public static boolean isPrime(int x){
		for(int i = 2; i < x / 2; i++){
			if (x % i == 0)
				return false;
		}
		return true;
	}
	
	//isEven(MyInteger x), isOdd(MyInteger x), and isPrime(MyInteger x) take in a MyInteger Object and check to see if its iValue is even, odd, and prime
	public static boolean isEven(MyInteger x){
		return x.isEven();
	}
	
	public static boolean isOdd(MyInteger x){
		return x.isOdd();
	}
	
	public static boolean isPrime(MyInteger x){
		return x.isPrime();
	}
	
	//equals(int x) takes in and int and checks to see if that value is the same as the MyInteger's iValue
	public boolean equals(int x){
		return (x == getiValue());
	}
	
	//equals(MyInteger x) compares the iValues of two MyIntegers
	public boolean equals(MyInteger x){
		return x.equals(iValue);
	}

}
