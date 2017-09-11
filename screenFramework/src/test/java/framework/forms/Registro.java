package framework.forms;

import framework.annotations.Control;
import framework.annotations.Form;
import framework.components.XPasswordField;
import framework.components.XTextField;

@Form(name="Registro",title="Registrar Usuario")
public class Registro
{
	@Control(label="Usuario",tipoClase=XTextField.class)
	String usuario;
	
	@Control(label="Password",tipoClase=XPasswordField.class)
	String contrasenia;	

	@Control(label="Email",tipoClase=XTextField.class)
	String mail;
}
