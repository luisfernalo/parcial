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

	public void agregarpersona(String _nombre,String _apellido,String _tipo,String _numero,String _edad,String _peso,String _altura,String _celular,String _direccion,String _puesto) {
		Persona obj = new Persona(_nombre, _apellido, _tipo, _numero, _edad, _peso, _altura, _celular, _direccion, _puesto);
		listapersona.add(obj);
		if(_puesto=="oro") {
			
		}
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
