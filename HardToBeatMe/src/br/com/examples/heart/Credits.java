package br.com.examples.heart;

import java.awt.Color;
import java.awt.Font;

import br.com.etyllica.core.event.GUIAction;
import br.com.etyllica.core.event.GUIEvent;
import br.com.etyllica.core.event.KeyboardEvent;
import br.com.etyllica.core.event.PointerEvent;
import br.com.etyllica.core.video.Grafico;
import br.com.etyllica.gui.button.RoundButton;
import br.com.etyllica.gui.label.TextLabel;
import br.com.etyllica.layer.ImageLayer;

public class Credits extends HeartApplication{

	private RoundButton backButton;
	
	private ImageLayer background;
	
	public Credits(int w, int h) {
		super(w, h);
	}

	@Override
	public void load() {
		
		loadingPhrase = "Loading Background...";
		background = new ImageLayer("splash.png");
		
		backButton = new RoundButton(40,500,80,80);
		backButton.setLabel(new TextLabel("Back"));
		
		backButton.addAction(GUIEvent.MOUSE_LEFT_BUTTON_DOWN, new GUIAction(this, "back"));
		add(backButton);
		
		loading = 100;
	}

	public void back(){
		returnApplication = new HeartMenu(w, h);
		changeScene = true;
	}
	
	@Override
	public GUIEvent updateMouse(PointerEvent event) {
		
		if(changeScene){
			return GUIEvent.APPLICATION_CHANGED;
		}
		
		return GUIEvent.NONE;
	}

	@Override
	public void draw(Grafico g) {
		
		background.draw(g);
		
		g.setColor(Color.BLACK);
		g.setAlpha(40);
		g.fillRect(20, 0, w-40, h);
		g.setAlpha(100);
		
		g.setFont(g.getFont().deriveFont(32f).deriveFont(Font.BOLD));
		
		g.setColor(Color.WHITE);
		
		g.escreveSombraX(50, "Credits");
		
		g.escreveSombraX(250, "Pedro Viriato - Art");
		g.escreveSombraX(300, "Rafael Bastos - Sounds");
		g.escreveSombraX(350, "Yuri Pourre - Programming");
		
			
	}

	@Override
	public GUIEvent updateKeyboard(KeyboardEvent arg0) {
		// TODO Auto-generated method stub
		return GUIEvent.NONE;
	}
	
}
