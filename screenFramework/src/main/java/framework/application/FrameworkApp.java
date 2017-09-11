package framework.application;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import framework.annotations.Control;
import framework.components.XContainer;
import framework.components.XPasswordField;
import framework.components.XTextField;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FrameworkApp
{	
	ApplicationManager app;
	List<Object> listForms = new ArrayList<Object>();
	XContainer contenedor;
	Scene scene;
	
	public void init(){
		app = new ApplicationManager();
	}
	
	public void lunchApp(String[] args){
		app.main(args);
	}
	
	public <T> void addForm(T clazz){
		Class form = clazz.getClass();
		
		final Field[] atributos = form.getDeclaredFields();
		
		for(Field atributo : atributos){
			Annotation annotationAtributo = atributo.getAnnotation(Control.class);			
						
			if(annotationAtributo != null && annotationAtributo instanceof XTextField){
				//FIXME agregar logica
			}else if(annotationAtributo != null && annotationAtributo instanceof XPasswordField){
				//FIXME agregar logica
			}
			
			listForms.add(form);
		}
	}

	public void addFrame(double ancho, double alto)
	{
		contenedor = new XContainer();
		scene = new Scene(contenedor,ancho,alto);
	}
}
