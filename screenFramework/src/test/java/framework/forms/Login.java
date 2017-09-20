package framework.forms;

import framework.annotations.Control;
import framework.annotations.Form;
import framework.annotations.ButtonSubmit;
import framework.components.XPasswordField;
import framework.components.XTextField;

@Form(name="Login",title="Iniciar Sesion")
public class Login
{
	@Control(label="Usuario",tipoClase=XTextField.class,xPosition=0,yPosition=0)
	String usuario;
	
	@Control(label="Password",tipoClase=XPasswordField.class,xPosition=0,yPosition=1)
	String contrasenia;
	
//	@ButtonSubmit(name="Ingresar")
//	String ingresar;
//	
//	@ButtonSubmit(name="Registrar")
//	String registrar;

	public String getUsuario()
	{
		return usuario;
	}

	public void setUsuario(String usuario)
	{
		this.usuario=usuario;
	}

	public String getContrasenia()
	{
		return contrasenia;
	}

	public void setContrasenia(String contrasenia)
	{
		this.contrasenia=contrasenia;
	}

//	public String getIngresar()
//	{
//		return ingresar;
//	}
//
//	public void setIngresar(String ingresar)
//	{
//		this.ingresar=ingresar;
//	}
//
//	public String getRegistrar()
//	{
//		return registrar;
//	}
//
//	public void setRegistrar(String registrar)
//	{
//		this.registrar=registrar;
//	}
	
}
