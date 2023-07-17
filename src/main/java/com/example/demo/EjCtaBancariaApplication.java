package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repo.modelo.CtaBancaria;
import com.example.demo.repo.modelo.Propietario;
import com.example.demo.service.ICtaBancariaService;
import com.example.demo.service.IPropietarioService;
import com.example.demo.service.ITransferenciaService;

@SpringBootApplication
public class EjCtaBancariaApplication implements CommandLineRunner{

	@Autowired
	private IPropietarioService propietarioService;
	@Autowired
	private ITransferenciaService transferenciaService;
	@Autowired
	private ICtaBancariaService ctaBancariaService;
	
	public static void main(String[] args) {
		SpringApplication.run(EjCtaBancariaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		BigDecimal montoCta1 = new BigDecimal(1500);
		BigDecimal montoCta2 = new BigDecimal(2700);
		
		Propietario propietario1 = new Propietario();
		propietario1.setNombre("John");
		propietario1.setApellido("Ramos");
		propietario1.setCedula("001");
		
//		this.propietarioService.agregar(propietario1);
		
		CtaBancaria ctaBancaria1 = new CtaBancaria();
		ctaBancaria1.setNumero("111");
		ctaBancaria1.setPropietario(this.propietarioService.buscar("001"));
		ctaBancaria1.setSaldo(montoCta1);
		ctaBancaria1.setTipo("A");
		
//		this.ctaBancariaService.agregar(ctaBancaria1);
		
		Propietario propietario2 = new Propietario();
		propietario2.setNombre("Bruce");
		propietario2.setApellido("Wayne");
		propietario2.setCedula("002");
		
//		this.propietarioService.agregar(propietario2);
		
		CtaBancaria ctaBancaria2 = new CtaBancaria();
		ctaBancaria2.setNumero("222");
		ctaBancaria2.setPropietario(this.propietarioService.buscar("002"));
		ctaBancaria2.setSaldo(montoCta2);
		ctaBancaria2.setTipo("A");
		
//		this.ctaBancariaService.agregar(ctaBancaria2);
		
		BigDecimal montoTrasferencia = new BigDecimal(430);		
//		this.transferenciaService.realizarTransf(ctaBancaria2.getNumero(), ctaBancaria1.getNumero(), montoTrasferencia);
		System.out.println("Reporte: ");
		this.transferenciaService.buscarTodos().stream().forEach(System.out::println);
		
	}
}
