package visiteur;

public class CalculSalaire implements IVisitor{
	private double Salaire;

	public CalculSalaire(double Salaire) {
		super();
		this.Salaire =0;
	}

	public void setSalaire(double Salaire) {
		this.Salaire = Salaire;
	}

	@Override
	public void VisiteurDirecteur(Directeur d) {
		this.setSalaire(d.getSalaireDirec());
		// TODO Auto-generated method stub
		
	}

	@Override
	public void VisiteurManager(Manager m) {
		this.setSalaire(m.getSalaireManager());
		// TODO Auto-generated method stub
		
	}

	@Override
	public void VisiteurCommerciaux(Commerciaux c) {
		this.setSalaire(c.getSalaireCommerciaux());
		// TODO Auto-generated method stub
		
	}

	@Override
	public void VisiteurOuvriers(Ouvriers o) {
		this.setSalaire(o.getSalaireOuvr());
		// TODO Auto-generated method stub
		
	}

}
