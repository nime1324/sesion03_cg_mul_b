
package sistemascoordenadas2d;


public class Cilindrica {
    private double radio;
    private double angulo;
    private double z;
    /* dos formas del construcytor uno sin parametros y otro con parametros
    metodos sobrecargados para convertir de cilindrica a esferica 
    de esferica a cilindrica 
    8

*/



    public Cilindrica(double radio, double angulo, double z) {
        this.radio = radio;
        this.angulo = angulo;
        this.z = z;
    }

    public Cilindrica() {
    }
        public double getRadio() {
        return radio;
    }

    public double getAngulo() {
        return angulo;
    }

    public double getZ() {
        return z;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    public void setZ(double z) {
        this.z = z;
    }
    
    
}
