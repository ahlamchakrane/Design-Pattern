package Decorator;

import Boisson.Boisson;

public abstract class AbstractDecorator extends Boisson{
	protected Boisson boisson;
	public AbstractDecorator(Boisson boisson) {
		super();
		this.boisson = boisson;
	}
	public abstract String getDescription();
}
