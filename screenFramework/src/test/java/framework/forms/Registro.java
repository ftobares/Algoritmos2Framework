package framework.forms;

import framework.actions.Action;
import framework.actions.NavigateAction;
import framework.actions.SaveAction;
import framework.annotations.Control;
import framework.annotations.Form;
import framework.application.FrameworkApp;
import framework.annotations.ButtonSubmit;
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
	
	@ButtonSubmit(name="Crear Cuenta",action="crearCuenta")	
	String crearCuenta;
	
	@ButtonSubmit(name="Iniciar Sesion",action="iniciarSesion")	
	String iniciarSesion;
	
	public void crearCuenta(FrameworkApp app){
		System.out.println("Se ejecuta el metodo crearCuenta");
		Action registro = new SaveAction();
		registro.execute(app,MostrarInformacion.class);
	}
	
	public void iniciarSesion(FrameworkApp app){
		
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
