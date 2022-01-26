package com.intfc;

public abstract class Sales implements Transaction1 {
private int stock=1000;
	@Override
	public int sale(int qty) {
		this.stock=stock-qty;
		return this.stock;
	}

	@Override
	public int purchase(int qty) {
		this.stock=this.stock+qty;
		return this.stock;
	}

}
