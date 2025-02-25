package com.utad.dawe.model;

public class JugadorBalonMano {

	private String nombre;
	private int dorsal;
	private int anotacion = 0;
	private int bloqueo = 0;
	private int tiempojugado = 0;
	
	
	public void jugar (int jornadas) {
		for (int i = 0; i < jornadas; i++) {
			
			anotacion += (int) (Math.random() * 4);
			bloqueo += (int) (Math.random() * 3);
			tiempojugado += 300;
		}
	}
	
	
	public JugadorBalonMano(String nombre, int dorsal) {
		this.nombre = nombre;
		this.dorsal = dorsal;
	}


	public void setAnotacion(int anotacion) {
		this.anotacion = anotacion;
	}


	public void setBloqueo(int bloqueo) {
		this.bloqueo = bloqueo;
	}


	public void setTiempojugado(int tiempojugado) {
		this.tiempojugado = tiempojugado;
	}


	@Override
	public String toString() {
		return "Jugador " + nombre + ". Dorsal nº " + dorsal + ".\nEstadisticas: Anotaciones: " + anotacion + ". Bloqueos: "
				+ bloqueo + ". Tiempo jugado: " + tiempojugado + "s.\n";
	}


	public int getAnotacion() {
		return anotacion;
	}


	public int getBloqueo() {
		return bloqueo;
	}


	public int getTiempojugado() {
		return tiempojugado;
	}
	
	
	
	
	
	
	
	
	
	
	
}
