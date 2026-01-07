package application.services;

import application.domaine.Utilisateur;
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


	// Méthode créer un utilisateur
	public void creerUtilisateur(String prenom, String nom) {

		String identifiant = prenom.substring(0).toLowerCase() + nom.toLowerCase();
		String courriel = prenom + "." + nom + "@mail.com";
		Utilisateur utilisateur = new Utilisateur(identifiant, nom, prenom, courriel);
		utilisateurRepository.getUtilisateurs().add(utilisateur);

	}
}
