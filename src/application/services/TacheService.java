package application.services;

import application.domaine.Etat;
import application.domaine.Tache;
import application.repositories.TacheRepository;

public class TacheService {

	private int compteurId = 11;
	private final TacheRepository tacheRepository;

	public TacheService() {
		tacheRepository = new TacheRepository();
	}

	public void creerTache(String titre) {
		compteurId++;

		Tache nouvelleTache = new Tache(compteurId, titre, Etat.NON_ASSIGNEE, null);
		tacheRepository.getTaches().add(nouvelleTache);
		IO.println("Tache créé : " + nouvelleTache);
	}
}
