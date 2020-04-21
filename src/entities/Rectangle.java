package entities;

public class Rectangle {
	
	public double Width;
	public double Height;
	
	public double Area() {
		return this.Width * this.Height;
	}
	
	public double Perimeter() {
		return 2 * (this.Width + this.Height);
	}
	
	public double Diagonal() {
		return Math.sqrt((this.Width * this.Width) + (this.Height * this.Height) );
	}
	
	public String toString() {
		return "AREA: " + 
	            String.format("%.2f%n", this.Area()) +
		       "PERIMETER: " + 
		       String.format("%.2f%n", this.Perimeter()) +
		       "DIAGONAL: " + 
		       String.format("%.2f%n", this.Diagonal());
		
	}

}
