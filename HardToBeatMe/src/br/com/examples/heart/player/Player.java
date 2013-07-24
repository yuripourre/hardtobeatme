package br.com.examples.heart.player;

import java.awt.Color;

import br.com.etyllica.core.DrawableComponent;
import br.com.etyllica.core.video.Grafico;
import br.com.etyllica.layer.AnimatedLayer;

public class Player implements DrawableComponent{

	private PlayerAction action = PlayerAction.RUN;
	
	private AnimatedLayer layer;
	
	public Player(int x, int y){
		super();
		
		layer = new AnimatedLayer(x,y,114,144,"player.png");
		layer.setAnimaEmX(true);
		layer.setFrames(12);
		layer.anima();
		
	}
	
	@Override
	public void draw(Grafico g) {
		
		Color color = Color.BLACK;
		
		switch(action){
		case RUN:
			color = Color.RED;
			break;
		case JUMP:
			color = Color.YELLOW;
			break;
		case FALL:
			color = Color.GREEN;
			break;
		case WALK:
			color = Color.BLUE;
			break;
		}
		
		g.setColor(color);
		
		layer.draw(g);
		//camada.draw(g);
		//g.drawRect(camada.getX(),camada.getY(),camada.getW(),camada.getH());
		
	}
	
	public AnimatedLayer getCamada(){
		return layer;
	}

	public PlayerAction getAction() {
		return action;
	}

	public void setAction(PlayerAction action) {
		this.action = action;
	}	
	
}
