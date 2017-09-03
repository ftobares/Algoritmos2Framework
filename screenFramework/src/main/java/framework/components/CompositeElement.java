package framework.components;

import java.util.ArrayList;

public class CompositeElement extends XElement
{
	private ArrayList<XElement> hijos = new ArrayList<XElement>();
	
	public void addElement(XElement element){
		
	}
	
	public void deleteElement(XElement element){
		
	}
	
	public XElement getChildrenById(int elementId){
		return hijos.get(elementId);
	}
}
