package art.view;

import javax.swing.JFrame;
import art.controller.ArtController;

public class ArtFrame extends JFrame
{
	private ArtPanel appPanel;
	
	public ArtFrame(ArtController app)
	{
		super();
		appPanel = new ArtPanel(app);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(1000, 700);
		this.setContentPane(appPanel);
		this.setTitle("Creating Modern Art");
		this.setVisible(true);
	}
}
