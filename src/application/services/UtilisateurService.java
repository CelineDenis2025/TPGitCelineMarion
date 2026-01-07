package application.services;

import application.domaine.Utilisateur;
import application.repositories.UtilisateurRepository;

public class UtilisateurService {

	private final UtilisateurRepository utilisateurRepository;

	public UtilisateurService() {
		utilisateurRepository = new UtilisateurRepository();
	}

	public Utilisateur rechercherParId(String identifiant) {
		for (Utilisateur us :utilisateurRepository.getUtilisateurs()) {
			if (us.getIdentifiant().equals(identifiant)) {
				return us;
			}
		}
		return null;
	}
}
