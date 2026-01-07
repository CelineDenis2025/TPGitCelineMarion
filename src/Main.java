import application.domaine.Tache;
import application.domaine.Utilisateur;
import application.repositories.UtilisateurRepository;
import application.services.TacheService;
import application.services.UtilisateurService;

void main() {
	UtilisateurRepository utilisateurRepository = new UtilisateurRepository();

	TacheService taches = new TacheService();
	UtilisateurService utilisateurs = new UtilisateurService();


	//Placez vos appels de méthodes ici

	// Test créer un utilisateur
	// utilisateurs.creerUtilisateur("Paulin", "Novotny");
	IO.println(utilisateurRepository.getUtilisateurs());
}