package ets.programa;

public class Cono {
    private Circulo base;
    private float altura;
    private String color;

    /**
     * Constructor que pide por teclado o en este caso mediante Random para pasar los datos del
     * programa main al programa Cono
     *
     * @param cX Hace referencia al dato x del programa Circulo.
     * @param cY Hace referencia al dato y del programa Circulo.
     * @param r Hace referencia al radio del programa Circulo.
     * @param h Hace referencia a la altura.
     * @param color Hace referencia al color.
     */
    public Cono (float cX, float cY, float r, float h, String color) { // constructor
        this.base = new Circulo(cX, cY, r);
        this.altura = h;
        this.color = color;
    }

    /**
     *
     */
    public void imprimir () {
        base.imprimir();
        System.out.println(" h=" + altura + " c=" + color);
    }
}

