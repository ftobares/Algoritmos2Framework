package framework.application;

import framework.forms.MostrarInformacion;
import framework.forms.Registro;

public class AppTest
{
	public static void main(String[] args) throws NoSuchMethodException, SecurityException	{
		FrameworkApp app = new FrameworkApp();
		app.init("Formularios");
		app.lunchApp(args);
		app.setFrameSize(400,400);
		app.addForm(Registro.class);
//		app.addForm(MostrarInformacion.class);
//		app.show();
	}
}