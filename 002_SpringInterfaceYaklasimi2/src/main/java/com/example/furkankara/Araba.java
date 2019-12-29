package com.example.furkankara;

public class Araba {

	private Yakit yakit;

	/*public Araba() {
		this.yakit = new Yakit();
	}*/
	
	public Araba(Yakit yakit) {
		this.yakit =yakit;
	}
	
	public void hareketeGec() {
		yakit.depo();
		System.out.println("Araba harekete gecti.");
	}
	
}
