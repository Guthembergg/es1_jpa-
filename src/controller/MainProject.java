package controller;

import java.sql.Date;

import model.Evento;
import model.EventoDAO;


public class MainProject {
	
	public static void main(String[] args) {
	Date data = new Date(2013000l);
	Evento festa = new Evento("festa  bella", data, "non ci stava", "PRIVATA", 10);
	
	EventoDAO.addEvento(festa);
}
}