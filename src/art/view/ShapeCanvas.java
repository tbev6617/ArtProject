package art.view;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JPanel;

import art.controller.ArtController;

public class ShapeCanvas extends JPanel
{
	private ArrayList<Polygon> triangleList;
	private ArrayList<Polygon> polygonList;
	private ArrayList<Polygon> ellipseList;
	private ArrayList<Polygon> rectangleList;
	private ArtController app;
	
	private BufferedImage canvasImage;
	
	public ShapeCanvas(ArtController app)
	{
		
	}
	
	public void addShape(Shape current)
	{
		
	}
	
	public void clear()
	{
		
	}
	
	public void changeBackground()
	{
		
	}
	
	public void save()
	{
		
	}
	
	private Color randomColor()
	{
		return null;
	}
	
	private void updateImage()
	{
		
	}
	
	protected void paintComponent(Graphics graphics)
	{
		
	}
	
	
}
