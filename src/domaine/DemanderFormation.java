package domaine;

public class DemanderFormation {

	private String dateDebut;
	private String dateDemande;
	private String dateFin;
	private String etatValidation;
	@SuppressWarnings("unused")
	private final static String ACCORDE = "valide";
	private final static String ATTENTE = "en attente";
	@SuppressWarnings("unused")
	private final static String REFUS = "refus";

	public DemanderFormation(String dateDebut, String dateFin, String etatValidation) {
		super();
		this.dateDebut = dateDebut;
		this.dateDemande = "Aujourd'hui";
		this.dateFin = dateFin;
		this.etatValidation = etatValidation;
	}

	public DemanderFormation(String dateDebut, String dateFin) {
		this(dateDebut, dateFin, ATTENTE);
	}
	
	@Override
	public String toString() {
		return "DemanderFormation [dateDebut=" + dateDebut + ", dateDemande=" + dateDemande + ", dateFin=" + dateFin
				+ ", etatValidation=" + etatValidation + "]";
	}

	// GETTERS & SETTERS
	public String getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}

	public String getDateDemande() {
		return dateDemande;
	}

	public void setDateDemande(String dateDemande) {
		this.dateDemande = dateDemande;
	}

	public String getDateFin() {
		return dateFin;
	}

	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}

	public String getEtatValidation() {
		return etatValidation;
	}

	public void setEtatValidation(String etatValidation) {
		this.etatValidation = etatValidation;
	}

}
