
package sistemascoordenadas2d;
/*bajo el sistema de coordenadas cartesianas referir un 
punto con sus retspectrivas propiedades y valores .
Dchos valores deben asignarse como una entradfa por teclado de parte del usuario
*/
public class SistemasCoordenadas2D {

    public static void main(String[] args) {
        Cartesiana2D punto = new Cartesiana2D();
        Polar punto2 = new Polar();
        Cartesiana2D punto3 = new Cartesiana2D();
       
        // agregar las instrucciones necesarias para que se presente 
        // en la pantalla la solicitud de los datos y posteriormente
        // el usuario los ingrese desde el teclado 
        punto.setX(4);
        
    }
    
}
class Cartesiana2D{
private double x, y;

public void setX(double x){
this.x = x;}
public void setY(double y){
this.y = y;}

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

public Cartesiana2D polar_cartesiana2d(double r, double angulo){
    Cartesiana2D obj = new Cartesiana2D();
    x = r* Math.cos(angulo);
    y = r* Math.sin(angulo);
    
    return obj;

}
public Cartesiana2D polar_cartesiana2d(Polar p){
    
    return polar_cartesiana2d(p.getRadio(), p.getAngulo());
}

}

class Polar{
    private double radio;
    private double angulo;
    
    public Polar(){
    }
    public Polar(double radio, double angulo){
    this.radio = radio;
    this.angulo = angulo;
    }

    public double getRadio() {
        return radio;
    }

    public double getAngulo() {
        return angulo;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public void setAngulo(float angulo) {
        this.angulo = angulo;
    }
    
    public Polar cartesiana2d_polar(double x , double y){
        double r = Math.sqrt(x * x + y* y);
        double ang = Math.atan(y/x);
        return new Polar(r, ang);
    
    }
    public Polar cartesiana2d_polar(Cartesiana2D c){
            return new Polar(c.getX(), c.getY());

    }

}
