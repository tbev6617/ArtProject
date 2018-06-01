package art.controller;

import java.io.IOException;

import javax.swing.JOptionPane;

import art.view.ArtFrame;

public class ArtController 
{
	ArtFrame frame;
	public void start()
	{
		frame = new ArtFrame(this);
	}
	public ArtFrame getFrame()
	{
		return frame;
	}
	public void handleErrors(IOException error)
	{
		JOptionPane.showMessageDialog(frame, error.getMessage());
	}
}