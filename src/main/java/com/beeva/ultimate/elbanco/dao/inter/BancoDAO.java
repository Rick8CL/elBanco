package com.beeva.ultimate.elbanco.dao.inter;

/**
 * Ricardo Castillo Lara
 * Aplicación para la primer evaluación del Curso de APX
 * Entrega 14/07/2017
 * 
 * Clase Abstracta para acceder a los metodos que registran y consultan
 * datos en la tabla bancos de la BD
 * 
 */

import com.beeva.ultimate.elbanco.dao.model.Banco;

public abstract class BancoDAO {
	public abstract void save(Banco banco);
	public abstract Banco getBancoById(int id);
}