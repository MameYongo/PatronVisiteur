package visiteur;

public class Directeur implements IEntreprise{
	private int salaireDirec;
	private int indice;
	private int bonus;
	private int salaireDeBase;

	public Directeur(int salaireDirec, int indice, int bonus, int salaireDeBase) {
		super();
		this.salaireDirec = salaireDirec;
		this.indice = indice;
		this.bonus = bonus;
		this.salaireDeBase = salaireDeBase;
	}

	@Override
	public void accept(IVisitor v) {
		v.VisiteurDirecteur(this);
		// TODO Auto-generated method stub
		
	}

	public int getSalaireDirec() {
		return bonus*indice+salaireDeBase;
	}

}
