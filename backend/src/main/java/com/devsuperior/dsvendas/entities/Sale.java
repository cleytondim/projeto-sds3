package com.devsuperior.dsvendas.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_sales")
public class Sale {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate date;
	
	@ManyToOne
	@JoinColumn(name = "seller_id")
	private Seller seller;
	
	public Sale() {
	}

	public Sale(long id, Integer viseted, Integer deals, Double amount, LocalDate date, Seller seller) {
		Id = id;
		this.visited = viseted;
		this.deals = deals;
		this.amount = amount;
		this.date = date;
		this.seller = seller;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public Integer getViseted() {
		return visited;
	}

	public void setViseted(Integer viseted) {
		this.visited = viseted;
	}

	public Integer getDeals() {
		return deals;
	}

	public void setDeals(Integer deals) {
		this.deals = deals;
	}

	public Double getamount() {
		return amount;
	}

	public void setamount(Double amount) {
		this.amount = amount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}
}
