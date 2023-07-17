package com.example.demo.repo.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "transferencia")
public class Transferencia {
	
	private Integer id;
	private LocalDate fecha;
	private BigDecimal monto;

}
