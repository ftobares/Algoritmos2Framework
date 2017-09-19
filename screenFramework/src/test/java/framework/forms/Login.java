package framework.forms;

import framework.annotations.Control;
import framework.annotations.Form;
import framework.annotations.Submit;
import framework.components.XPasswordField;
import framework.components.XTextField;

@Form(name="Login",title="Iniciar Sesion")
public class Login
{
	@Control(label="Usuario",tipoClase=XTextField.class,xPosition=0,yPosition=0)
	String usuario;
	
	@Control(label="Password",tipoClase=XPasswordField.class,xPosition=0,yPosition=1)
	String contrasenia;
	
	@Submit(name="Ingresar")
	String ingresar;
	
	@Submit(name="Registrar")
	String registrar;
}
