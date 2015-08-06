package abstraction;

public abstract class Personnel {
	public abstract float salaireBrut();

	public abstract float nbreMoisTravaille();

	public double indemniteConges() {
		return salaireBrut() * nbreMoisTravaille() / 12;
	}
}
