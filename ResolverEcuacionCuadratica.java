public class ResolverEcuacionCuadratica {
    public static void main(String[] args) {
        double coeficienteA = 1.0; // Ingrese los valores de A, B y C aquí
        double coeficienteB = 2.0;
        double coeficienteC = -3.0;

        double discriminante = coeficienteB * coeficienteB - 4 * coeficienteA * coeficienteC;

        if (discriminante > 0) {
            double raiz1 = (-coeficienteB + Math.sqrt(discriminante)) / (2 * coeficienteA);
            double raiz2 = (-coeficienteB - Math.sqrt(discriminante)) / (2 * coeficienteA);
            System.out.println("Raíz 1 (x1): " + raiz1);
            System.out.println("Raíz 2 (x2): " + raiz2);
        } else if (discriminante == 0) {
            double raizUnica = -coeficienteB / (2 * coeficienteA);
            System.out.println("Raíz única (x): " + raizUnica);
        } else {
            System.out.println("La ecuación no tiene soluciones reales.");
        }
    }
}