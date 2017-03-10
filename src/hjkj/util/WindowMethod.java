package hjkj.util;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class WindowMethod
{
	/**
	 * 		���ڳ�ʼ�����������Ļ�����м�
	 * 
	 * @param container
	 *            �������ڵĶ���
	 */
	public static void setSoftInScreenCenter(Container container) 
	{
		// �õ���Ļ��������Ϣ
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		// �õ��������Ѵ�С
		int softwidth = container.getWidth() / 2;
		int softheight = container.getHeight() / 2;
		// ������Ļ����������ض�Ӧ��ϵ
		int initwidth = (int) screenSize.getWidth() / 2 - softwidth;
		int initheight = (int) screenSize.getHeight() / 2 - softheight;
		// ��ʼ������λ��
		container.setLocation(initwidth, initheight);
	}
	
	/**
	 * 		�������С����ߴ�
	 * 
	 * @param container
	 *            �������ڵĶ���
	 */
	public static void setSoftMin(Container container) 
	{
		// �õ���Ļ��������Ϣ
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int) (3 * (screenSize.getWidth() / 4));
		int height = (int) (3 * (screenSize.getHeight() / 4));
		container.setPreferredSize(new Dimension(width, height));
	}

	/**
	 * 		�����������ߴ�
	 * 
	 * @param container
	 *            �������ڵĶ���
	 */
	public static void setSoftMax(Container container) 
	{
		// �õ���Ļ��������Ϣ
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int) screenSize.getWidth();
		int height = (int) screenSize.getHeight() - 50;
		container.setPreferredSize(new Dimension(width, height));
	}
	
	public static void setWindowStyle()
	{
		try
		{
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} 
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		} 
		catch (InstantiationException e)
		{
			e.printStackTrace();
		} 
		catch (IllegalAccessException e)
		{
			e.printStackTrace();
		} 
		catch (UnsupportedLookAndFeelException e)
		{
			e.printStackTrace();
		}
	}
	
}
