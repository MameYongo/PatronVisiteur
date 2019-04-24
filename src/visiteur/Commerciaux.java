package visiteur;

public class Commerciaux implements IEntreprise{

	public double SalaireCommerciaux;
	private int primeVente;
	private double impot;
	public double getSalaireCommerciaux() {
		return primeVente+10000-impot;
	}
	public Commerciaux(double salaireCommerciaux, int primeVente, double impot) {
		super();
		SalaireCommerciaux = salaireCommerciaux;
		this.primeVente = primeVente;
		this.impot = impot;
	}
	@Override
	public void accept(IVisitor v) {
		v.VisiteurCommerciaux(this);
		// TODO Auto-generated method stub
		
	}

}
