package framework.components;

import java.util.ArrayList;

public class CompositeElement
{
	private ArrayList<Object> hijos = new ArrayList<Object>();
	
	public void addElement(){
		
	}
	
	public void deleteElement(){
		
	}
	
	public Object getChildrenById(int elementId){
		return hijos.get(elementId);
	}
}
