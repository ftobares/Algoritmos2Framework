package framework.application;

import framework.forms.Registro;

public class AppTest
{
	public static void main(String[] args)	{
		FrameworkApp app = new FrameworkApp();
		app.init();
		app.setTitle("Formularios");
		app.lunchApp(args);
		app.setFrameSize(400,400);
		app.addForm(Registro.class);
	}
}