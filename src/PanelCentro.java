import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class PanelCentro  extends JPanel {
	private DefaultTableModel referencia_table_model;
	public String[] columnas = { "Nombre","Apellido","Tipo","Numero", "Edad", "Peso", "Altura", "Celular","Direccion", "Puesto"};
	private Object[][]tableContents;
	private JTable tabla_pajaro;
	public PanelCentro() {
		setLayout(new BorderLayout());
		Border borde1 = BorderFactory.createTitledBorder("Listado");
		setBorder (borde1);
		
		tableContents = new Object[0][0];
		referencia_table_model = new DefaultTableModel(tableContents,columnas);
		tabla_pajaro = new JTable(referencia_table_model);
		this.add(new JScrollPane(tabla_pajaro), BorderLayout.WEST);
	}
	

	private VentanaInicial referenciaVentaPrincipal;
	public PanelCentro(VentanaInicial _referenciaVentaPrincipal) {
		referenciaVentaPrincipal = _referenciaVentaPrincipal;
 }

	public void refrescarListaplata(ArrayList<Pajaro> refrescarArrayList) {
		if(refrescarArrayList.isEmpty()) {
			JOptionPane.showMessageDialog(null, "no hay elementos");
		}else {
			tableContents= new Object [refrescarArrayList.size()][10];
			for(int i=0;i<refrescarArrayList.size();i++) {
				tableContents[i][0]= refrescarArrayList.get(i).getNombre();
				tableContents[i][1]= refrescarArrayList.get(i).getApellido();
				tableContents[i][2]= refrescarArrayList.get(i).getTipo();
				tableContents[i][3]= refrescarArrayList.get(i).getNumero();
				tableContents[i][4]= refrescarArrayList.get(i).getEdad();
				tableContents[i][5]= refrescarArrayList.get(i).getPeso();
				tableContents[i][6]= refrescarArrayList.get(i).getAltura();
				tableContents[i][7]= refrescarArrayList.get(i).getCelular();
				tableContents[i][8]= refrescarArrayList.get(i).getDireccion();
				tableContents[i][9]= refrescarArrayList.get(i).getPuesto();
				
			}
			referencia_table_model.setDataVector(tableContents,columnas);
		}
	}

}
