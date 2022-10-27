package adapter;

import ancienne.AncienneImpl;
//composition
public class AdapterImpl2 implements Standard{
	 AncienneImpl  ancienneImpl = new  AncienneImpl();
	@Override
	public void operation(double n1, double nb2) {
		double p = ancienneImpl.produit(n1, nb2);
		ancienneImpl.afficher(p);
	}	

}
