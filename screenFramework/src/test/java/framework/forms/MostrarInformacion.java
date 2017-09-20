package framework.forms;

import framework.annotations.Control;
import framework.annotations.Form;
import framework.components.XLabel;

@Form(name="Informacion",title="Informacion de Registro")
public class MostrarInformacion
{
	@Control(label="Registrado con exito!",tipoClase=XLabel.class,xPosition=2,yPosition=2)
	String mensaje;

	public String getMensaje()
	{
		return mensaje;
	}

	public void setMensaje(String mensaje)
	{
		this.mensaje=mensaje;
	}
}
