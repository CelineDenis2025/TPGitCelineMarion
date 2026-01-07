package application.services;

import application.domaine.Utilisateur;
import application.domaine.Utilisateur;
import application.repositories.UtilisateurRepository;

public class UtilisateurService {

	private final UtilisateurRepository utilisateurRepository;

	public UtilisateurService() {
		utilisateurRepository = new UtilisateurRepository();
	}

	public void afficherTous() {
		IO.println(utilisateurRepository.getUtilisateurs());
	}

	public void creerUtilisateur(String prenom, String nom) {
		String identifiant = prenom.substring(0, 1).toLowerCase() + nom.toLowerCase();
		String courriel = prenom.toLowerCase() + "." + nom.toLowerCase() + "@mail.com";
		Utilisateur nouvelUtilisateur = new Utilisateur(identifiant, nom, prenom, courriel);
		utilisateurRepository.getUtilisateurs().add(nouvelUtilisateur);
	}


	public Utilisateur rechercherParId(String identifiant) {
		for (Utilisateur us :utilisateurRepository.getUtilisateurs()) {
			if (us.getIdentifiant().equals(identifiant)) {
				return us;
			}
		}
		return null;
	}


	public void modifierCourriel(String identifiant, String courriel){
		for (Utilisateur us :utilisateurRepository.getUtilisateurs()) {
			if(us.getIdentifiant().equals(identifiant)){
				us.setCourriel(courriel);
			}
		}
	}


}
