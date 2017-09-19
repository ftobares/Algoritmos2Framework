package framework.application;

import framework.forms.Registro;

public class AppTest
{
	public static void main(String[] args)	{
		FrameworkApp app = new FrameworkApp();
		app.init();	
		app.lunchApp(args);
		app.addFrame(400,400);
		app.addForm(Registro.class);
	}
}