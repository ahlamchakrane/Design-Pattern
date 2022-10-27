package adapter;

import ancienne.AncienneImpl;
//heritage
public class AdapterImpl extends AncienneImpl implements Standard{

	@Override
	public void operation(double n1, double nb2) {
		double p = produit(n1, nb2);
		afficher(p);
	}	

}
