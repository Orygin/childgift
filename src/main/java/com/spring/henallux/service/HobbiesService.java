package com.spring.henallux.service;

import java.util.ArrayList;
import org.springframework.stereotype.Service;
import com.spring.henallux.model.Hobby;

@Service
public class HobbiesService {
	private ArrayList<Hobby> liste;

	public ArrayList<Hobby> getListe() {
		return liste;
	}

	public void setListe(ArrayList<Hobby> liste) {
		this.liste = liste;
	}
	
	public HobbiesService(){
		liste = new ArrayList<Hobby>();
		liste.add(new Hobby("sport", "Sport"));
		liste.add(new Hobby("nature", "Nature"));
		liste.add(new Hobby("reading", "Reading"));
		liste.add(new Hobby("music", "Music"));
		liste.add(new Hobby("swag", "Swag"));
	}
}
