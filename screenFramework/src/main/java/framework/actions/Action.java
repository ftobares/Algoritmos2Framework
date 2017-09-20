package framework.actions;

import framework.application.FrameworkApp;
import framework.forms.MostrarInformacion;
import javafx.event.ActionEvent;

public abstract class Action
{

	public abstract void execute(FrameworkApp app, Class<?> clazz);
	
}
