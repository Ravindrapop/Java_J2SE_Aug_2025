package com.yuvraj.getter.setter$arithmetic.operator;

public class ArithmeticOperatorsDemo {
	
	public int additon( int a, int b) {
		return (a+b);
	}
	
	public int sustraction(int a, int b) {
		return (a-b);
	}
	
	public int multiplication(int a, int b) {
		return (a*b);
	}
	
	public int division(int a, int b) {
		return (a/b);
	}
	
	public int modulus(int a, int b) {
		return (a%b);
	}
	
	
	public static void main(String[] args) {
		
		ArithmeticOperatorsDemo add = new ArithmeticOperatorsDemo();
		ArithmeticOperatorsDemo sub = new ArithmeticOperatorsDemo();
		ArithmeticOperatorsDemo mul = new ArithmeticOperatorsDemo();
		ArithmeticOperatorsDemo div = new ArithmeticOperatorsDemo();
		ArithmeticOperatorsDemo mod = new ArithmeticOperatorsDemo();
		
		int Add = add.additon(20, 25);
		int Sub = sub.sustraction(40, 25);
		int Mul = mul.multiplication(4, 7);
		int Div = div.division(50, 10);
		int Mod = mod.modulus(7, 3);
		int Mod1 = mod.modulus(7, 4);
		
		System.out.println("Add = " + Add);
        System.out.println("Substract = " + Sub);
        System.out.println("Multiply = " + Mul);
        System.out.println("Divide = " + Div);
        System.out.println("Moulus = " + Mod);
        System.out.println("Moulus = " + Mod1);

	}
}
