package Decorator;

import Boisson.Boisson;

public class Noisette extends AbstractDecorator{
	public Noisette(Boisson boisson) {
		super(boisson);
	}
	@Override
	public double cout() {
		return 7+boisson.cout();
	}
	@Override
	public String getDescription() {
		return boisson.getDescription()+" au noisette ";
	}
}
