
package Dominio;

public class PesoIdealCalculadora {
    public static double calcularPesoIdeal(Individuo individuo) {
        char sexo = individuo.getSexo();
        double altura = individuo.getAltura() / 100; 
        int idade = individuo.getIdade();
        
        if (sexo == 'M') {
            if (idade <= 20) {
                return (72.7 * altura) - 58;
            } else if (idade >= 21 && idade <= 39) {
                return (72.7 * altura) - 53;
            } else if (idade >= 40) {
                return (72.7 * altura) - 45;
            }
        } else if (sexo == 'F') {
            if (altura <= 1.50) {
                if (idade >= 35) {
                    return (62.1 * altura) - 45;
                } else {
                    return (62.1 * altura) - 49;
                }
            } else {
                if (idade <= 35) {
                    return (62.1 * altura) - 49;
                } else {
                    return (62.1 * altura) - 44.7;
                }
            }
        }
        
        return -1; 
    }
}
