//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        double[][] matrixb = new double[3][3];

        Scanner scanner = new Scanner(System.in);

        System.out.println("ORTONORMALIZACION DE BASES MEDIANTE GRAM-SCHMIDT");

        System.out.print("\n");

        System.out.println("Ingrese una base de R^3: ");

        System.out.print("\n");

        for (int i = 0; i < matrixb.length; i++) {

            System.out.println("-- Vector " + (i + 1) + " --");

            for (int j = 0; j < matrixb.length; j++) {

                System.out.print("Entrada " + (j + 1) + ": ");

                matrixb[i][j] = scanner.nextDouble();

            }
            System.out.print("\n");
        }

        for (int i = 0; i < matrixb.length; i++) {

            System.out.print("v" + (i + 1) + " = (");

            for (int j = 0; j < matrixb.length; j++) {

                if (j == 2) {

                    System.out.print(matrixb[i][j]);

                } else {

                    System.out.print(matrixb[i][j] + ", ");

                }

            }

            System.out.println(")");

        }

        System.out.println("{v1,v2,v3} -> BASE DE R^3");

        System.out.print("\n");

        double[][] matrixbo = new double[3][3];

        double[][] matrixbon = new double[3][3];

        matrixbo[0] = matrixb[0];

        double pe1 = ((matrixb[1][0] * matrixbo[0][0]) +
                (matrixb[1][1] * matrixbo[0][1]) +
                (matrixb[1][2] * matrixbo[0][2])) /
                ((matrixbo[0][0] * matrixbo[0][0]) +
                        (matrixbo[0][1] * matrixbo[0][1]) +
                        (matrixbo[0][2] * matrixbo[0][2]));

        matrixbo[1][0] = matrixb[1][0] - pe1 * matrixbo[0][0];
        matrixbo[1][1] = matrixb[1][1] - pe1 * matrixbo[0][1];
        matrixbo[1][2] = matrixb[1][2] - pe1 * matrixbo[0][2];

        double pe2 = ((matrixb[2][0] * matrixbo[1][0]) +
                (matrixb[2][1] * matrixbo[1][1]) +
                (matrixb[2][2] * matrixbo[1][2])) /
                ((matrixbo[1][0] * matrixbo[1][0]) +
                        (matrixbo[1][1] * matrixbo[1][1]) +
                        (matrixbo[1][2] * matrixbo[1][2]));

        matrixbo[2][0] = matrixb[2][0] - pe1 * matrixbo[0][0] - pe2 * matrixbo[1][0];
        matrixbo[2][1] = matrixb[2][1] - pe1 * matrixbo[0][1] - pe2 * matrixbo[1][1];
        matrixbo[2][2] = matrixb[2][2] - pe1 * matrixbo[0][2] - pe2 * matrixbo[1][2];

        for (int i = 0; i < matrixbo.length; i++) {

            System.out.print("w" + (i + 1) + " = (");

            for (int j = 0; j < matrixbo.length; j++) {

                if (j == 2) {

                    System.out.print(matrixbo[i][j]);

                } else {

                    System.out.print(matrixbo[i][j] + ", ");

                }

            }

            System.out.println(")");

        }
        System.out.println("{w1,w2,w3} -> BASE ORTOGONAL DE R^3");
        System.out.print("\n");

        for (int i = 0; i < matrixbon.length; i++) {

            for (int j = 0; j < matrixbon.length; j++) {

                matrixbon[i][j] = (matrixbo[i][j])
                        / (Math.sqrt(Math.pow(matrixbo[i][0], 2) + Math.pow(matrixbo[i][1], 2) + Math.pow(matrixbo[i][2], 2)));

            }

        }
        for (int i = 0; i < matrixbon.length; i++) {

            System.out.print("y" + (i + 1) + " = (");

            for (int j = 0; j < matrixbon.length; j++) {

                if (j == 2) {

                    System.out.print(matrixbon[i][j]);

                } else {

                    System.out.print(matrixbon[i][j] + ", ");

                }

            }

            System.out.println(")");

        }
        System.out.println("{y1,y2,y3} -> BASE ORTONORMAL DE R^3");

        scanner.close();
    }
}
