package orientadoAoBjetos;

public class Retangle {
	private double width;
	private double Height;
	
	public double area () {
		return getHeight()*getWidth();
	}
	public double perimenter () {
		return 2*(getHeight()+getWidth());
	}
	public double diagonal () {
		return Math.sqrt(Math.pow(getHeight(), 2) + Math.pow(getWidth(), 2)) ;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return Height;
	}
	public void setHeight(double height) {
		Height = height;
	}	
}
