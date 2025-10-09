package com.ksg.operator;

public class ShortCirOpeDemo {

	public static void main(String[] args) {

		 
        int x = 10;
        
        int y = 20;
        
        if(++x>10 || ++y<15) {
            ++x;
        }else {
            ++y;
        }
        
        System.out.println(x+" "+ y);
	}

}
