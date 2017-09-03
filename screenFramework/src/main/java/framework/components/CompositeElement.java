package framework.components;

import java.util.ArrayList;

public class CompositeElement extends Element
{
	private ArrayList<Element> hijos = new ArrayList<Element>();
	
	public void addElement(Element element){
		
	}
	
	public void deleteElement(Element element){
		
	}
	
	public Element getChildrenById(int elementId){
		return hijos.get(elementId);
	}
}
