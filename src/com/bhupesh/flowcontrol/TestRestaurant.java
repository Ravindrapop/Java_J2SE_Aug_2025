package com.bhupesh.flowcontrol;

public class TestRestaurant {
	
	public static void main(String[] args) {
		
		Restaurant[] rest = {new Restaurant(" Idli Sambhar"," Masala Dosa"," Paneer Momos"),new Restaurant(" 80 rs"," 150 rs"," 120 rs"),
				new Restaurant(" 1Plat-4pcs"," 1pcs"," 1Plat-8pcs")};
		
		int size = rest.length;
		
		for(int i = 0; i<size; i++) {
			System.out.println(rest[i]);
		}
	}

}
