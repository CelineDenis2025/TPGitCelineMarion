package application.services;

import application.domaine.Utilisateur;
import application.repositories.UtilisateurRepository;

import java.util.List;

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

	public void rechercherTous() {
		List<Utilisateur> listeUtilisateurs = utilisateurRepository.getUtilisateurs();

		for (Utilisateur u : listeUtilisateurs) {
			IO.println(u);
		}
	}
}
