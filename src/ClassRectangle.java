public class ClassRectangle {
    double width, height;
    public ClassRectangle(){
    }
    public ClassRectangle(double width,double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return this.width * this.height;
    }
    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }
    public String display() {
        return "Rectangle has width = " + width + " and height = " + height;
    }
}
