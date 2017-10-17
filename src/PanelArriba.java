import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class PanelArriba  extends JPanel  {
	private DefaultTableModel referencia_table_model;
	public String[] columnas = {"Nombre","Apellido","tipo","Puntaje"};
	private Object[][]tableContents;
	private JTable tabla_pajaro;
	public PanelArriba() {
		setLayout(new BorderLayout());
		Border borde1 = BorderFactory.createTitledBorder("Listado");
		setBorder (borde1);
		
		tableContents = new Object[0][0];
		referencia_table_model = new DefaultTableModel(tableContents,columnas);
		tabla_pajaro = new JTable(referencia_table_model);
		this.add(new JScrollPane(tabla_pajaro), BorderLayout.WEST);
	}
	
	public void refrescarLista(ArrayList<Pajaro> refrescarArrayList) {
		if(refrescarArrayList.isEmpty()) {
			JOptionPane.showMessageDialog(null, "no hay elementos");
		}else {
			tableContents= new Object [refrescarArrayList.size()][4];
			for(int i=0;i<refrescarArrayList.size();i++) {
				tableContents[i][0]= refrescarArrayList.get(i).getNombre();
				tableContents[i][1]= refrescarArrayList.get(i).getEspecie();
				tableContents[i][2]= refrescarArrayList.get(i).getEdad();
				tableContents[i][3]= refrescarArrayList.get(i).getPuntaje();
				
			}
			referencia_table_model.setDataVector(tableContents,columnas);
		}
	}
}
