package Decorator;

import Boisson.Boisson;

public class Vanille extends AbstractDecorator{
	public Vanille(Boisson boisson) {
		super(boisson);
	}
	@Override
	public double cout() {
		return 9+boisson.cout();
	}
	@Override
	public String getDescription() {
		return boisson.getDescription()+" au vanille ";
	}
}
