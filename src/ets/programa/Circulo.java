package ets.programa;

public class Circulo {
    private float x, y;
    private float radio;

    /**
     * Constructor que pide por teclado o en este caso mediante Random para pasar los datos del
     * programa main al programa Circulo
     *
     * @param cX Hace referencia al dato x
     * @param cY Hace referencia al dato y
     * @param r Hace referencia al radio
     */
    public Circulo (float cX, float cY, float r) { // constructor
        this.x = cX;
        this.y = cY;
        this.radio = r;
    }

    /**
     * Muestra la y para que se muestre en otro programa.
     *
     * @return Guarda la y en la clase
     */
    public float getY() { return y; }

    /**
     * Pasa un valor a esta clase y le pone y.
     *
     * @param y Guarda el valor como y para que se puede guardar en el programa
     */
    public void setY(float y) { this.y = y; }

    /**
     * Hallar el area del circulo mediante el radio.
     *
     * @return El area que sale de esta operación.
     */
    public float area() { return (float)Math.PI*radio*radio; }

    public void imprimir () {
        System.out.print(" x=" + x);
        System.out.print(" y=" + y);
        System.out.print(" r=" + radio);
        System.out.print(" A=" + area());
    }
}
