package com.springboot.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
@Entity
public class Product {
   @Id
   @GeneratedValue (strategy = GenerationType.IDENTITY)

	private int pid;
	private String pname;
	private int pprice;
	private double pQuantity;
	
	@ManyToMany(mappedBy = "products")
	List<Card> carts;
	@OneToMany
	List<Order> orders;

	public double getpQuantity() {
		return pQuantity;
	}

	public void setpQuantity(double pQuantity) {
		this.pQuantity = pQuantity;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + ", getPid()=" + getPid()
				+ ", getPname()=" + getPname() + ", getPprice()=" + getPprice() + "]";
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPprice() {
		return pprice;
	}

	public void setPprice(int pprice) {
		this.pprice = pprice;
	}

}
