import application.domaine.Tache;
import application.domaine.Utilisateur;
import application.repositories.UtilisateurRepository;
import application.services.TacheService;
import application.services.UtilisateurService;

void main() {

	TacheService taches = new TacheService();
	UtilisateurService utilisateurs = new UtilisateurService();


	//Placez vos appels de méthodes ici

	// Test créer un utilisateur
	utilisateurs.creerUtilisateur("Paulin", "Novotny");
	utilisateurs.afficherTous();

	// test modifier courriel
	utilisateurs.afficherTous();
	utilisateurs.modifierCourriel("pnovotny", "brigitte.bardot@mail.com");
	utilisateurs.afficherTous();


}