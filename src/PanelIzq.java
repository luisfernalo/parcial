import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.*;
import javax.swing.border.Border;
public class PanelIzq extends JPanel {
private VentanaInicial referenciaVentaPrincipal;
	private GridBagConstraints c;
	private Insets in;
	private JLabel JLnombre,JLapellido,JLtipo,JLnumero,JLedad,JLpeso,JLaltura,JLcelular,JLdirrecion,JLpuesto;
	private JTextField JTnombre,JTapellido,JTtipo,JTnumero,JTedad,JTpeso,JTaltura,JTcelular,JTdirrecion,JTpuesto;
	JButton Bagregar;
	public PanelIzq(VentanaInicial _referenciaVentaPrincipal) {
		referenciaVentaPrincipal = _referenciaVentaPrincipal;
	
		setLayout(new GridBagLayout());
		Border borde1 = BorderFactory.createTitledBorder("Formulario");
		setBorder(borde1);
		
		JLnombre= new JLabel("Nombre:");
		c = new GridBagConstraints();
		c.gridx=0;
		c.gridy=0;
		c.fill = GridBagConstraints.BOTH;
		in = new Insets(5,10,5,10);
		c.insets= in;
		add(JLnombre,c);
		
		JTnombre = new JTextField();
		c= new GridBagConstraints();
		c.gridx=0;
		c.gridy=1;
		c.fill = GridBagConstraints.BOTH;
		in = new Insets (5,10,5,10);
		c.insets = in ;
		add(JTnombre,c);
		
		JLapellido= new JLabel("Apellido:");
		c = new GridBagConstraints();
		c.gridx=0;
		c.gridy=2;
		c.fill = GridBagConstraints.BOTH;
		in = new Insets(5,10,5,10);
		c.insets= in;
		add(JLapellido,c);
		
		JTapellido = new JTextField();
		c= new GridBagConstraints();
		c.gridx=0;
		c.gridy=3;
		c.fill = GridBagConstraints.BOTH;
		in = new Insets (5,10,5,10);
		c.insets = in ;
		add(JTapellido,c);
		
		JLtipo= new JLabel("Nombre:");
		c = new GridBagConstraints();
		c.gridx=0;
		c.gridy=4;
		c.fill = GridBagConstraints.BOTH;
		in = new Insets(5,10,5,10);
		c.insets= in;
		add(JLtipo,c);
		
		JTtipo = new JTextField();
		c= new GridBagConstraints();
		c.gridx=0;
		c.gridy=5;
		c.fill = GridBagConstraints.BOTH;
		in = new Insets (5,10,5,10);
		c.insets = in ;
		add(JTtipo,c);
		
		JLnumero= new JLabel("Nombre:");
		c = new GridBagConstraints();
		c.gridx=0;
		c.gridy=6;
		c.fill = GridBagConstraints.BOTH;
		in = new Insets(5,10,5,10);
		c.insets= in;
		add(JLnumero,c);
		
		JTnumero = new JTextField();
		c= new GridBagConstraints();
		c.gridx=0;
		c.gridy=7;
		c.fill = GridBagConstraints.BOTH;
		in = new Insets (5,10,5,10);
		c.insets = in ;
		add(JTnumero,c);
		
		JLedad= new JLabel("Nombre:");
		c = new GridBagConstraints();
		c.gridx=0;
		c.gridy=8;
		c.fill = GridBagConstraints.BOTH;
		in = new Insets(5,10,5,10);
		c.insets= in;
		add(JLedad,c);
		
		JTedad = new JTextField();
		c= new GridBagConstraints();
		c.gridx=0;
		c.gridy=9;
		c.fill = GridBagConstraints.BOTH;
		in = new Insets (5,10,5,10);
		c.insets = in ;
		add(JTedad,c);
		
		JLpeso= new JLabel("Nombre:");
		c = new GridBagConstraints();
		c.gridx=0;
		c.gridy=10;
		c.fill = GridBagConstraints.BOTH;
		in = new Insets(5,10,5,10);
		c.insets= in;
		add(JLpeso,c);
		
		JTpeso = new JTextField();
		c= new GridBagConstraints();
		c.gridx=0;
		c.gridy=1;
		c.fill = GridBagConstraints.BOTH;
		in = new Insets (5,10,5,10);
		c.insets = in ;
		add(JTpeso,c);
		
		
	}
}
