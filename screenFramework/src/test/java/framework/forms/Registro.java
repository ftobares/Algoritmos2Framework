package framework.forms;

import framework.annotations.Action;
import framework.annotations.Control;
import framework.annotations.Form;
import framework.annotations.Submit;
import framework.components.XPasswordField;
import framework.components.XTextField;

@Form(name="Registro",title="Registrar Usuario")
public class Registro
{
	@Control(label="Usuario",tipoClase=XTextField.class,xPosition=0,yPosition=0)
	String usuario;
	
	@Control(label="Password",tipoClase=XPasswordField.class,xPosition=0,yPosition=1)
	String contrasenia;	

	@Control(label="Email",tipoClase=XTextField.class,xPosition=0,yPosition=2)
	String mail;
	
	@Submit(name="Crear Cuenta")
	@Action(name="registro",method="crearCuenta")
	String crearCuenta;
	
	public void crearCuenta(){
		
	}
}
