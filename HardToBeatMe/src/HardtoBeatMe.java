import sound.paulscode.libraries.LibraryJOAL;
import br.com.etyllica.EtyllicaFrame;
import br.com.etyllica.core.loader.MultimediaLoader;
import br.com.examples.heart.HeartMenu;

public class HardtoBeatMe extends EtyllicaFrame {
	
	private static final long serialVersionUID = 3003259067958762021L;

	public HardtoBeatMe(){
		super(800,600);
	}

	public static void main(String[] args){
		HardtoBeatMe game = new HardtoBeatMe();
		game.setTitle("Hard To Beat Me");
		game.init();
		game.setVisible(true);
		
		MultimediaLoader.getInstance().setSoundLibrary(LibraryJOAL.class);
	}
	
	@Override
	public void startGame(){

		setMainApplication(new HeartMenu(w, h));
		
	}

}


