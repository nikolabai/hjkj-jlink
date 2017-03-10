package hjkj.ui;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import org.junit.Test;

public class FrameTest {

	public FrameTest() throws UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel(new org.jvnet.substance.skin.SubstanceOfficeSilver2007LookAndFeel());
		// SubstanceLookAndFeel.setCurrentTheme("org.jvnet.substance.theme.SubstanceDesertSandTheme");

		JFrame.setDefaultLookAndFeelDecorated(true);
		JDialog.setDefaultLookAndFeelDecorated(true);
	}
	
	@Test
	public void configFrametest() {
		new ConfigFrame();
	}
	
	@Test
	public void jlinkFrametest() {
		new JLinkFrame();
	}
}
