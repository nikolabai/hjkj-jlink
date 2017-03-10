package hjkj.ui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

public class TableTest extends JFrame{

	private String[] columnNames = {"1","2","3","4","5"};
	private Object[][] todayData;
	
	private JPanel backPanel;

	// today,tomorrow,third day info
	private JPanel todayPanel;
	private JTable todayTable; 
	
	private JButton backButton = new JButton("back");
	private static JButton orderButton = new JButton("sure");

	public TableTest() {	
		
		
		todayData = new Object[3][5];
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 5; j++){
				if(j == 4){
					todayData[i][4] = orderButton;
				}
				else{
					todayData[i][j] = "(" + (i + 1) + "," + (j + 1) + ")";
				}
			}
		}
		
		this.setLayout(null);
		this.setBounds(4, 48, 704, 470);
	
		backPanel = new JPanel();
		backButton.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		backPanel.setBounds(4, 48, 704, 470);
		backPanel.setLayout(null);

		todayPanel = new JPanel();
		todayPanel.setBorder(getBorder("title"));
		todayPanel.setBounds(5, 10, 694, 140);
		todayPanel.setLayout(null);
		todayPanel.add(getTodayTable());
		backPanel.add(todayPanel);
		
		this.add(backPanel);
		this.pack();
		

	}


	private JTable getTodayTable() {
		JTable todayTable = new JTable(new MyTableModel(columnNames, todayData));
//		todayTable = new JTable(new DefaultTableModel(columnNames, todayDate));
		todayTable.setBounds(4, 23, 686, 108);
		todayTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // ֻ��ѡ��һ��
		todayTable.setColumnSelectionAllowed(false);
		todayTable.setShowHorizontalLines(true);
		todayTable.setShowVerticalLines(true);
		todayTable.setRowHeight(18);
		todayTable
				.setDefaultRenderer(JButton.class, new ComboBoxCellRenderer());

		todayTable.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int row = todayTable.getSelectedRow();
				int column = todayTable.getSelectedColumn();
				if (column == 4) {
					System.out
							.println("FilmPanel line 271: Order Ticket Today!");
				}
			}
		});

		TableColumn firsetColumn = todayTable.getColumnModel().getColumn(0);
		firsetColumn.setPreferredWidth(40);
		firsetColumn.setMaxWidth(40);
		firsetColumn.setMinWidth(40);

		TableColumn secondColumn = todayTable.getColumnModel().getColumn(1);
		secondColumn.setPreferredWidth(150);
		secondColumn.setMaxWidth(150);
		secondColumn.setMinWidth(150);

		TableColumn thirdColumn = todayTable.getColumnModel().getColumn(2);
		thirdColumn.setPreferredWidth(50);
		thirdColumn.setMaxWidth(50);
		thirdColumn.setMinWidth(50);

		TableColumn fourColumn = todayTable.getColumnModel().getColumn(3);
		fourColumn.setPreferredWidth(50);
		fourColumn.setMaxWidth(50);
		fourColumn.setMinWidth(50);
		
		TableColumn lastColumn = todayTable.getColumnModel().getColumn(4);
		lastColumn.setPreferredWidth(250);
		lastColumn.setMaxWidth(250);
		lastColumn.setMinWidth(250);
		
		return todayTable;
	}
	
	private Border getBorder(String title) {
		Border etchedBorder = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		return BorderFactory.createTitledBorder(etchedBorder, title,
				TitledBorder.ABOVE_TOP, TitledBorder.LEFT);
	}
	
	class MyTableModel extends AbstractTableModel {
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

//		public Class<?> getColumnClass(int columnIndex) {
//			return obj[0][columnIndex].getClass();
//		}

		@Override
		public boolean isCellEditable(int rowIndex, int columnIndex) {
			return false;
		}

	}

	
	public static void main(String[] args) {
		TableTest tableTest = new TableTest();
		tableTest.setPreferredSize(new Dimension(500,200));
		tableTest.sizeWindowOnScreen(tableTest,0.6,0.6);
		tableTest.setVisible(true);
	}
	
	private void sizeWindowOnScreen(Container calculator, double widthRate, double heightRate)
	{
	   Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	   calculator.setSize(new Dimension((int)(screenSize.width * widthRate),(int)(screenSize.height *heightRate)));
	}
}


class ComboBoxCellRenderer implements TableCellRenderer {
	public Component getTableCellRendererComponent(JTable table, Object value,
			boolean isSelected, boolean hasFocus, int row, int column) {
		JButton cmb = (JButton) value;
		cmb.setSize(50, 18);
		if (isSelected) {
			cmb.setForeground(table.getSelectionForeground());
			cmb.setBackground(table.getSelectionBackground());
		} else {
			cmb
					.setForeground((unselectedForeground != null) ? unselectedForeground
							: table.getForeground());
			cmb
					.setBackground((unselectedBackground != null) ? unselectedBackground
							: table.getBackground());
		}
		cmb.setFont(table.getFont());
		if (hasFocus) {
			cmb
					.setBorder(UIManager
							.getBorder("Table.focusCellHighlightBorder"));
			if (!isSelected && table.isCellEditable(row, column)) {
				Color col;
				col = UIManager.getColor("Table.focusCellForeground");
				if (col != null) {
					cmb.setForeground(col);
				}
				col = UIManager.getColor("Table.focusCellBackground");
				if (col != null) {
					cmb.setBackground(col);
				}
			}
		} else {
			cmb.setBorder(noFocusBorder);
		}

		cmb.setHorizontalAlignment(SwingConstants.CENTER);

		return cmb;
	}

	protected static Border noFocusBorder = new EmptyBorder(1, 1, 1, 1);

	private Color unselectedForeground;
	private Color unselectedBackground;
}