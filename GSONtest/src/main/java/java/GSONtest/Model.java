package java.GSONtest;

import java.util.List;

public class Model {
List<String> given;
String family;

@Override
public String toString() {
	return "Model [given=" + given + ", family=" + family + "]";
}
public Model(List<String> given, String family) {
	super();
	this.given = given;
	this.family = family;
}
public List<String> getGiven() {
	return given;
}
public void setGiven(List<String> given) {
	this.given = given;
}
public String getFamily() {
	return family;
}
public void setFamily(String family) {
	this.family = family;
}
public Model() {
	super();
	// TODO Auto-generated constructor stub
}
}
