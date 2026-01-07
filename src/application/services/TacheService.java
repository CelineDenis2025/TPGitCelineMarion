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

	public void assignerTache(int idTache, String idUtilisateur) {
		Tache tache = null;
		for (Tache t : tacheRepository.getTaches()) {
			if (t.getId() == idTache) {
				tache = t;
			}
		}
		if (tache == null) {
			IO.println("Erreur: aucune tâche avec l'ID " + idTache);
			return;
		}
		tache.setIdUtilisateurAssigne(idUtilisateur);

		tache.setEtat(Etat.EN_COURS);
		IO.println("Tâche " + idTache + " assignée à " + idUtilisateur + " et passée à EN_COURS.");
	}

	public void rechercherParUtilisateur(String idUtilisateur) {
		boolean trouve = false;

		for (Tache t : tacheRepository.getTaches()) {
			if (idUtilisateur.equals(t.getIdUtilisateurAssigne())) {
				IO.println(t);
				trouve = true;
			}
		}
		if (!trouve) {
			IO.println("Aucune tâche assignée à l'utilisateur " + idUtilisateur);
		}
	}
}
