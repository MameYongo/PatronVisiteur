package visiteur;

public interface IVisitor {
	public void VisiteurDirecteur(Directeur d);
	public void VisiteurManager(Manager m);
	public void VisiteurCommerciaux(Commerciaux c);
	public void VisiteurOuvriers(Ouvriers o);
	

}
