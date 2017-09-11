package framework.components;

import javafx.scene.Node;
import javafx.scene.layout.BorderPane;

public class XContainer extends BorderPane
{
	
	public XContainer(){		
		super();
	}

	public void setCuerpoVentana(Node cuerpo){
		this.setCenter(cuerpo);
	}
	
	public void setMenuInferior(Node menu){
		this.setBottom(menu);
	}
	
	public void setMenuIzquierdo(Node menu){
		this.setLeft(menu);
	}
	
	public void setMenuDerecho(Node menu){
		this.setRight(menu);
	}
}
