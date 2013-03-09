package br.com.examples.heart;
import java.awt.Color;

import br.com.etyllica.core.application.GenericLoadApplication;
import br.com.etyllica.core.video.Grafico;
import br.com.etyllica.layer.ImageLayer;


public class LoadingGame extends GenericLoadApplication{

	protected ImageLayer loading;
	
	public LoadingGame(int x, int y, int w, int h) {
		super(x, y, w, h);
		
		//loading = new Camada(0,0,"");
	}
	
	private int rectW = 400;
	private int rectX = w/2-rectW/2;
	private int rectY = h/2+100;
	private int rectH = 32;
	
	@Override
	public void draw(Grafico g) {
		
		g.setColor(Color.WHITE);
		g.escreveSombraX(320, frase);

		g.drawRect(rectX, rectY, rectW, rectH);
		g.fillRect(rectX+2, rectY+2, ((rectW*fill)/100)-3, rectH-3);
		
		
		g.escreveLabelSombra(rectX, rectY, rectW, rectH, porcent, Color.BLACK);
		
	}

	
	
}
