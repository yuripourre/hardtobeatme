import sound.MultimediaLoader;
import sound.paulscode.libraries.LibraryJOAL;
import br.com.etyllica.EtyllicaFrame;
import br.com.etyllica.context.Application;
import br.com.etyllica.core.Configuration;
import br.com.examples.heart.HeartMenu;

public class HardtoBeatMe extends EtyllicaFrame {
	
	private static final long serialVersionUID = 3003259067958762021L;

	public HardtoBeatMe() {
		super(800,600);
	}

	public static void main(String[] args) {
		HardtoBeatMe game = new HardtoBeatMe();
		game.setTitle("Hard To Beat Me");
		game.init();			
	}
	
	@Override
	public Application startApplication() {
		addLoader(MultimediaLoader.getInstance());
		MultimediaLoader.getInstance().setSoundLibrary(LibraryJOAL.class);
		
		initialSetup("");
		
		Configuration.getInstance().setTimerClick(true);
		
		return new HeartMenu(w, h);
	}

}


