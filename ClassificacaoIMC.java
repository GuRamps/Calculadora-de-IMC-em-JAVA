import java.util.Scanner;

public class ClassificacaoIMC {
    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);
        
        System.out.println("Digite o seu nome:");
        String nome = lerTeclado.nextLine();
        
        System.out.println("Digite o gênero (M para Masculino, F para Feminino, N para não informar):");
        char genero = lerTeclado.next().charAt(0);
        
        System.out.println("Digite a sua altura em metros:");
        double altura = lerTeclado.nextDouble();
        
        System.out.println("Digite o seu peso em quilogramas:");
        double peso = lerTeclado.nextDouble();
        
        double imc = calcularIMC(peso, altura);
        String classificacao = getClassificacaoIMC(imc, genero);
        
        System.out.println("\nNome: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("Altura: " + altura + "m");
        System.out.println("Peso: " + peso + "kg");
        System.out.println("IMC: " + imc);
        System.out.println("Classificação: " + classificacao);
        
        lerTeclado.close();
    }
    
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }
    
    public static String getClassificacaoIMC(double imc, char genero) {
        if (genero == 'M') {
            if (imc < 20.7) {
                return "Abaixo do peso";
            } else if (imc < 26.4) {
                return "Peso normal";
            } else if (imc < 27.8) {
                return "Marginalmente acima do peso";
            } else if (imc < 31.1) {
                return "Acima do peso ideal";
            } else {
                return "Obeso";
            }
        } else { // Assume padrão feminino para outros gêneros e não informados
            if (imc < 19.1) {
                return "Abaixo do peso";
            } else if (imc < 25.8) {
                return "Peso normal";
            } else if (imc < 27.3) {
                return "Marginalmente acima do peso";
            } else if (imc < 32.3) {
                return "Acima do peso ideal";
            } else {
                return "Obeso";
            }
        }
    }
}
