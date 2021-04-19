package tp_Spring;

import java.util.List;

public class Team {

	private String nom;
	private String nbjoueurs;
	private List<Coach> coach;

	public Team() {

	}

	public Team(String nom, String nbjoueurs, List<Coach> coach) {

		this.nom = nom;
		this.nbjoueurs = nbjoueurs;
		this.coach = coach;
	}

	public Team(String nom, String nbjoueurs) {

		this.nom = nom;
		this.nbjoueurs = nbjoueurs;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNbjoueurs() {
		return nbjoueurs;
	}

	public void setNbjoueurs(String nbjoueurs) {
		this.nbjoueurs = nbjoueurs;
	}

	public List<Coach> getCoach() {
		return coach;
	}

	public void setCoach(List<Coach> coach) {
		this.coach = coach;
	}

	@Override
	public String toString() {
		return "Team [nom=" + nom + ", nbjoueurs=" + nbjoueurs + "]";
	}

	
	
}
