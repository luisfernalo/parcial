import javax.swing.JFrame;
import java.awt.*;
import java.util.ArrayList;
public class VentanaInicial extends JFrame {
	public ArrayList<Persona> listapersona;
	
	
	
	public VentanaInicial() {
		super("medallas");
		listapersona= new ArrayList<Persona>();
		inicio();
		componentes();
		pack();
		setLocationRelativeTo(null);
		
	}



	private VentanaInicial inicio() {
		Dimension dims = new Dimension(1000,700);
		this.setSize(dims);
		this.setPreferredSize(dims);
		this.getContentPane().setLayout(new BorderLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		return this;
	}



	private void componentes() {
		PanelIzq obj_panelIzq = new PanelIzq(this);
		add(obj_panelIzq,BorderLayout.WEST);
		
		PanelArriba obj_panelArri = new PanelArriba(this);
		add(obj_panelArri,BorderLayout.NORTH);
		
		PanelCentro obj_panelCentro = new PanelCentro(this);
		add(obj_panelCentro,BorderLayout.CENTER);
		
	}
	
	
}
