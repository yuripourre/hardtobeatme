package br.com.examples.heart;

import br.com.etyllica.context.Application;

public abstract class HeartApplication extends Application{

	protected boolean changeScene = false;
	
	public HeartApplication(int w, int h){
		super(w,h);
	}
	
}
