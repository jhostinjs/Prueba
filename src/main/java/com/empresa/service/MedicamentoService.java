package com.empresa.service;

import java.util.List;

import com.empresa.entity.Medicamento;

public interface MedicamentoService {
	
	public abstract Medicamento insertarActualizaMedicamento(Medicamento obj);
	
	public abstract List<Medicamento> listaMedicamento();

}
