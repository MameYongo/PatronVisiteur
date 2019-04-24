package visiteur;

public class Manager implements IEntreprise{
	private int salaireManager;
	private int indice;
	private int primedeVent;
	private int salaireDeBase;
	@Override
	public void accept(IVisitor v) {
		v.VisiteurManager(this);
		// TODO Auto-generated method stub
		
	}
	
	public Manager(int salaireManager, int indice, int primedeVent, int salaireDeBase) {
		super();
		this.salaireManager = salaireManager;
		this.indice = indice;
		this.primedeVent = primedeVent;
		this.salaireDeBase = salaireDeBase;
	}
	public int getSalaireManager() {
		return primedeVent*indice+salaireDeBase;
	}

}
