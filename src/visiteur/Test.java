/**
 * 
 */
package visiteur;

/**
 * @author User
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Directeur d=new Directeur(50000,12,25000,600000);
		System.out.println("Salaire directeur " +d.getSalaireDirec());
		// TODO Auto-generated method stub
		Manager m=new Manager(50000,2,6000,9000);
		System.out.println("Salaire manager: " +m.getSalaireManager());
		Ouvriers ouvrier=new Ouvriers(5, 1250);
		System.out.println("Salaire ouvrier: "+ouvrier.getSalaireOuvr());
		Commerciaux c=new Commerciaux(8000000,6000,10);
		System.out.println("Salaire commerciaux: "+c.getSalaireCommerciaux());
	}

}
