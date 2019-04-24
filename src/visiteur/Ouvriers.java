package visiteur;

public class Ouvriers implements IEntreprise {
	private double SalaireOuvr;
	private int nbrH;
	private double SalaireHorair;
	
	public Ouvriers(int nbrH, double salaireHorair) {
		super();
		this.SalaireOuvr=0;
		this.nbrH = nbrH;
		SalaireHorair = salaireHorair;
	}

	public double getSalaireOuvr() {
		return nbrH*SalaireHorair+5000;
	}
	
	@Override
	public void accept(IVisitor v) {
		v.VisiteurOuvriers(this);
		// TODO Auto-generated method stub
		
	}

}
