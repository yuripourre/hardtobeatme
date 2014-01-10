package br.com.examples.heart.obstacle;

import br.com.etyllica.core.video.Graphic;
import br.com.etyllica.layer.ImageLayer;
import br.com.examples.heart.beats.Heart;
import br.com.examples.heart.player.PlayerAction;

public class Car extends Obstacle{
	
	private ImageLayer layer;
	
	public Car() {
		super(1700,320);
		this.w = 100;
		this.h = 20;
		
		layer = new ImageLayer(x,y,"carro.png");
		
		this.actionSucess = PlayerAction.SUPER_JUMP;
		this.actionFail = PlayerAction.FALL;
		
		this.difficult = 460;
		
		int offsetX = x-100;
		
		
		this.heartSequence.add(new Heart(offsetX-640));
		this.heartSequence.add(new Heart(offsetX-530));
		this.heartSequence.add(new Heart(offsetX-420));
		this.heartSequence.add(new Heart(offsetX-270));
		this.heartSequence.add(new Heart(offsetX-160));
		this.heartSequence.add(new Heart(offsetX-20));
		
	}

	@Override
	public void move(int speed){
		this.x -= speed;
		this.layer.setOffsetX(-speed);
		
		for(Heart heart: heartSequence){
			heart.move(speed);
		}
	}
	
	@Override
	public void draw(Graphic g) {
		
		layer.draw(g);
		
	}
	
	
}

