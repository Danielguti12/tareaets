package ets.mastema;

import java.util.*;

public class AreaPrisma {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Prisma prisma;

        Prisma[] vecPrisma = new Prisma[3];
        List<Float> listaPrisma = new ArrayList<>();

        for (int i = 0; i < vecPrisma.length; i++) {


            prisma = new Prisma(0,0);

            System.out.print("Introduzca la altura del prisma " + (i + 1) + ": ");
            prisma.setAlturaPrisma(sc.nextInt());


            System.out.print("Introduce la base del triangulo " + (i + 1) + ": ");
            prisma.setBaseTriangulo(sc.nextInt());


            vecPrisma[i] = prisma;
            listaPrisma.add(vecPrisma[i].areaTotal());

        }

        
        for (int i = 0; i < vecPrisma.length; i++) {
            System.out.println("La altura del prisma " + (i + 1) + " es "+vecPrisma[i].getAlturaPrisma() + ", y la base "+vecPrisma[i].getBaseTriangulo()+" y el area total es "+vecPrisma[i].areaTotal());
        }
        Collections.sort(listaPrisma);
        System.out.println("La lista ordenada de menor a mayor es esta "+listaPrisma);


    }
}

