package ets.mastema;

public class Prisma {
    int baseTriangulo;
    int alturaPrisma;

    public Prisma(int baseTriangulo, int alturaPrisma) {
        this.baseTriangulo = baseTriangulo;
        this.alturaPrisma = alturaPrisma;
    }

    public int getBaseTriangulo() {
        return baseTriangulo;
    }

    public void setBaseTriangulo(int baseTriangulo) {
        this.baseTriangulo = baseTriangulo;
    }

    public int getAlturaPrisma() {
        return alturaPrisma;
    }

    public void setAlturaPrisma(int alturaPrisma) {
        this.alturaPrisma = alturaPrisma;
    }

    public float alturaTriangulo(){
        double op;
        op=this.baseTriangulo*this.baseTriangulo - (this.baseTriangulo * this.baseTriangulo)/4;
        return (float) Math.sqrt(op);
    }

    public float areaBase(){
        return (this.baseTriangulo*alturaTriangulo())/2;
    }

    public float perimetro(){
        return this.baseTriangulo*3;
    }

    public float areaLateral(){
        return perimetro()*this.alturaPrisma;
    }

    public float areaTotal(){
        return (2 * areaBase()) + areaLateral();
    }
}
