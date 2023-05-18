package com.raushan;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;

public class Product {
	private int pid;
	private String name;
	private int price;
	private int quant;
	public Product(int pid, String name, int price, int quant) {
		super();
		this.pid = pid;
		this.name = name;
		this.price = price;
		this.quant = quant;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		this.quant = quant;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", price=" + price + ", quant=" + quant + "]";
	}
	
	
}
@FunctionalInterface
interface geberateobj{
	Product createobj(int pid, String name, int price, int quant);
}
