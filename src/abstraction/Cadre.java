package abstraction;

public abstract class Cadre extends Personnel {

	@Override
	public float salaireBrut() {
		return 1_000;
	}

	@Override
	public float nbreMoisTravaille() {
		return 12;
	}
	
	public String toString(){
		return "Le salaire du cadre " + salaireBrut() + ", nombre de mois travaillé " + nbreMoisTravaille();
	}
	
	public abstract float bonusFinAnnee();

}
