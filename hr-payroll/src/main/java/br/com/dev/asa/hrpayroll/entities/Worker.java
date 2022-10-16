package br.com.dev.asa.hrpayroll.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;


@Data
public class Worker implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private BigDecimal dailyIncome;
	
}
