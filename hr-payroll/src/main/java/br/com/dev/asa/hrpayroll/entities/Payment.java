package br.com.dev.asa.hrpayroll.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;

@Data
public class Payment implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;
	private BigDecimal dailyIncome;
	private Integer days;	
	
	public Payment() {
		
	}

	public Payment(String name, BigDecimal dailyIncome, Integer days) {
		super();
		this.name = name;
		this.dailyIncome = dailyIncome;
		this.days = days;
	}

	public BigDecimal getTotal() {
		return dailyIncome.multiply(new BigDecimal(days.intValue()));
	}
}
