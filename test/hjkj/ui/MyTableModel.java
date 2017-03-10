package hjkj.ui;

import javax.swing.table.AbstractTableModel;

public class MyTableModel extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String headName[];
	private Object obj[][];

	public MyTableModel() {
		super();
	}

	public MyTableModel(String[] headName, Object[][] obj) {
		this();
		this.headName = headName;
		this.obj = obj;
	}

	public int getColumnCount() {
		return headName.length;
	}

	public int getRowCount() {
		return obj.length;
	}

	public Object getValueAt(int r, int c) {
		return obj[r][c];
	}

	public String getColumnName(int c) {
		return headName[c];
	}

//	public Class<?> getColumnClass(int columnIndex) {
//		return obj[0][columnIndex].getClass();
//	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}

}

