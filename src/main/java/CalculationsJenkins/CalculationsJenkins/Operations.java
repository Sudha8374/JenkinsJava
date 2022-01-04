package CalculationsJenkins.CalculationsJenkins;

public class Operations {
public int add(int numberOne, int numberTwo) {
		
		if((numberOne < 9999999) && (numberTwo< 9999999))
			return numberOne+numberTwo;
		else {
			return -1;	
		}
	}
	
	public int sub(int numberOne, int numberTwo) {
		if((numberOne < 9999999) && (numberTwo< 9999999))
			return numberOne-numberTwo;
		else 
			return -1;
	}
	
	public int mul(int numberOne, int numberTwo) {
		if((numberOne < 99999) && (numberTwo< 99999))
			return numberOne*numberTwo;
		else 
			return -1;
	}
	
	public double div(double numberOne, double numberTwo) {
		
			if((numberOne<9999999 && numberOne>=1)&& (numberTwo >=1 &&numberTwo < 9999999))
				return numberOne/numberTwo;
			else 
				return -1;
	}
	
	public double exp(double base, double power) {
		if((base>1 && base<=99)&&(power>1 && power<=10)) {
			return Math.pow(base, power);
		}else {
			return -1;
		}
	}
	
	public int fact(int n) {
		if(n>1 && n<=12) {
			int fact =1;
			for(int i =1; i<=n; i++ ) {
				fact *= i;
			}
			return fact;
		}	
		else {
			return -1;
		}
	}
}
