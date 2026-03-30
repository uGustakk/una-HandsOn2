public class Main {
    public static void main(String[] args) {

        // Raio da Terra em km
        double raio = 6371.01;

        // Coordenadas (em graus)
        double x1 = 25;
        double y1 = 35;
        double x2 = 35.5;
        double y2 = 25.5;

        // Converter graus para radianos
        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);

        // Fórmula da distância
        double distancia = raio * Math.acos(
                Math.sin(x1) * Math.sin(x2) +
                Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)
        );

        // Saída
        System.out.println("A distância entre esses pontos é: " + distancia + " km");
    }
}