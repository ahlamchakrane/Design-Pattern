package TemplateMethod;

public abstract class TemplateMethod {
	public int[] compresser(int[] data) {
		//traitement
		partieCompresser1();
		//traitement
		partieCompresser2();
		//traitement
		return data;
	}
	abstract void partieCompresser1();
	abstract void partieCompresser2();
}
