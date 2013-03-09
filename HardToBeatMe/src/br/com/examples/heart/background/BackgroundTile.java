package br.com.examples.heart.background;

import java.awt.Color;

import br.com.etyllica.core.DrawableComponent;
import br.com.etyllica.core.video.Grafico;
import br.com.etyllica.layer.Layer;

public class BackgroundTile extends Layer implements DrawableComponent{

	public BackgroundTile(){
		super();
	}
	
	@Override
	public void draw(Grafico g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, 800, 200);
	}
	
}
