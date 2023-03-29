package controller;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import model.Evento;
import model.*;

import model.EventoDAO;


public class MainProject {
	
	public static void main(String[] args) {
//	LocalDate data = LocalDate.now();
//	Evento festa = new Evento("festina", data, "yahoo", TipoEvento.PRIVATO, 50);
//		EventoDAO.addEvento(festa);
//		
//		
//		List<Evento> tutti =EventoDAO.findAll();
//		System.out.println(tutti);
//		Evento newEvento =EventoDAO.findEvento(4l);
//		newEvento.setTipo(TipoEvento.PRIVATO);
//		EventoDAO.updateEvento(newEvento);
		List<Evento> tutti =EventoDAO.findAll();
		List <Long> listaId= tutti.stream().map(Evento::getId).collect(Collectors.toList());
		for(int i=0; i<listaId.size();i++) {
		EventoDAO.removeEvento(EventoDAO.findEvento(listaId.get(i)));
		
		}
}
}