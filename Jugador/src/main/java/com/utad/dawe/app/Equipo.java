package com.utad.dawe.app;

import com.utad.dawe.model.JugadorBalonMano;

public class Equipo {

	public static void main(String[] args) {
		
		JugadorBalonMano jugador1 = new JugadorBalonMano("Pepe", 1);
		JugadorBalonMano jugador2 = new JugadorBalonMano("Juan", 2);
		
		jugador1.jugar(5);
		jugador2.jugar(5);
		
		System.out.println("5 Jornadas.");
		System.out.println(jugador1);
		System.out.println(jugador2);
		
		jugador1.jugar(5);
		jugador2.jugar(5);
		
		System.out.println("10 Jornadas.");
		System.out.println(jugador1);
		System.out.println(jugador2);
	}
}
