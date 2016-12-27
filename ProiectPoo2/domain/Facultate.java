package domain;

public class Facultate {

	String numeFacultate;
	int id;
	public String getNumeFacultate() {
		return numeFacultate;
	}
	public void setNumeFacultate(String numeFacultate) {
		this.numeFacultate = numeFacultate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Facultate [numeFacultate=" + numeFacultate + ", id=" + id + "]";
	}
	
}
