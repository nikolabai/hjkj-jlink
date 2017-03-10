package hjkj.util;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 * SCREEN SIZE
 * @author YUB
 *
 */
public class ScreenSize {

	private static Toolkit toolkit = Toolkit.getDefaultToolkit();
	private static Dimension dim = toolkit.getScreenSize();
	
	public static int Width = dim.width;
	public static int Height = dim.width;
	
}
