package Decorator;

import Boisson.Boisson;

public class Caramel extends AbstractDecorator{
	public Caramel(Boisson boisson) {
		super(boisson);
	}
	@Override
	public double cout() {
		return 3+boisson.cout();
	}
	@Override
	public String getDescription() {
		return boisson.getDescription()+" au caramel ";
	}
}
