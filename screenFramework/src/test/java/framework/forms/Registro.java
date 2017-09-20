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
	
	@Submit(name="Iniciar Sesion")
	@Action(name="inicio",method="iniciarSesion")
	String iniciarSesion;	
	
	public void crearCuenta(){
		
	}
	
	public void iniciarSesion(){
		
	}	

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

	public String getMail()
	{
		return mail;
	}

	public void setMail(String mail)
	{
		this.mail=mail;
	}

	public String getCrearCuenta()
	{
		return crearCuenta;
	}

	public void setCrearCuenta(String crearCuenta)
	{
		this.crearCuenta=crearCuenta;
	}	
}
