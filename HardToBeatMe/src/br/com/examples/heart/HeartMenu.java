package br.com.examples.heart;

import br.com.etyllica.core.event.GUIAction;
import br.com.etyllica.core.event.GUIEvent;
import br.com.etyllica.core.event.KeyboardEvent;
import br.com.etyllica.core.event.PointerEvent;
import br.com.etyllica.core.video.Grafico;
import br.com.etyllica.gui.button.RoundCornerButton;
import br.com.etyllica.gui.label.TextLabel;
import br.com.etyllica.layer.ImageLayer;

public class HeartMenu extends HeartApplication{
	
	public HeartMenu(int largura, int altura){
		super(largura, altura);
		
	}
	
	private ImageLayer background;
	
	private RoundCornerButton playButton;
	private RoundCornerButton instructionsButton;
	private RoundCornerButton creditsButton;
	
	@Override
	public void load() {
		
		background = new ImageLayer("splash.png");
		
		loadingPhrase = "Loading Background...";
		loading = 20;
		
		
		int offsetY = 300;
		
		playButton = new RoundCornerButton(200,offsetY,400,60);
		playButton.setLabel(new TextLabel("Play Game"));
		
		playButton.addAction(GUIEvent.MOUSE_LEFT_BUTTON_DOWN, new GUIAction(this, "play"));
		add(playButton);
		
		
		instructionsButton = new RoundCornerButton(200,offsetY+80,400,60);
		instructionsButton.setLabel(new TextLabel("Instructions"));
		instructionsButton.addAction(GUIEvent.MOUSE_LEFT_BUTTON_DOWN, new GUIAction(this, "instructions"));
		
		add(instructionsButton);
		
		creditsButton = new RoundCornerButton(200,offsetY+160,400,60);
		creditsButton.setLabel(new TextLabel("Credits"));
		creditsButton.addAction(GUIEvent.MOUSE_LEFT_BUTTON_DOWN, new GUIAction(this, "credits"));
		add(creditsButton);
		
		loading = 100;
	}
	
	public void play(){
		returnApplication = new HeartGame(w, h);
		changeScene = true;
	}
	
	public void instructions(){
		returnApplication = new Instructions(w, h);
		changeScene = true;
	}
	
	public void credits(){
		returnApplication = new Credits(w, h);
		changeScene = true;
	}
	
	@Override
	public GUIEvent updateMouse(PointerEvent event) {
		
		if(changeScene){
			
			remove(playButton);
			remove(instructionsButton);
			remove(creditsButton);
			
			return GUIEvent.APPLICATION_CHANGED;
		}
		
				
		return GUIEvent.NONE;
	}

	@Override
	public void draw(Grafico g) {
		
		background.draw(g);		
		
	}

	@Override
	public GUIEvent updateKeyboard(KeyboardEvent arg0) {
		// TODO Auto-generated method stub
		return GUIEvent.NONE;
	}
	
}