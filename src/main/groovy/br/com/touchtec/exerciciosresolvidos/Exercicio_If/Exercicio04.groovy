import javax.swing.JFrame
import javax.swing.JOptionPane

// IGNOREM ESTE TRECHO
Closure<Integer> pedeInteiro = {
    JFrame frame = new JFrame()
    String answer = JOptionPane.showInputDialog(frame, "Digite um inteiro")
    frame.dispose()
    return Integer.parseInt(answer)
}

Closure<Double> pedeDouble = {
    JFrame frame = new JFrame()
    String answer = JOptionPane.showInputDialog(frame, "Digite um real")
    frame.dispose()
    return Double.parseInt(answer)
}

def mostra = { def texto ->
    JFrame frame = new JFrame()
    String answer = JOptionPane.showMessageDialog(frame, texto.toString())
    frame.dispose()
    return answer
}

/**
 * Escreva um programa para ler 3 valores inteiros (considere que  não	
 * serão lidos valores iguais) e mostrá-los em ordem crescente.
 */

Integer valor1 = pedeInteiro();
Integer valor2 = pedeInteiro();
Integer valor3 = pedeInteiro();

if (valor1 < valor2 && valor2 < valor3) {
    mostra "Ordem Crescente " + valor1 + ", " +  valor2 + ", " + valor3;
}
if (valor2 < valor1 && valor1 < valor3){
    mostra "Ordem Crescente " + valor2 + ", " + valor1 + ", " + valor3;
}
if (valor3 < valor1 && valor1 < valor2){
    mostra "Ordem Crescente " + valor3 + ", " + valor1 + ", " + valor2;
}
if (valor3 < valor2 && valor2 < valor1){
    mostra "Ordem Crescente "+ valor3 + ", " + valor2 + ", " + valor1;
}
if (valor1 < valor3 && valor3 < valor2){
    mostra "Ordem Crescente "+ valor1 + ", " + valor3 + ", " + valor2;
}
if (valor2 < valor3 && valor3 < valor1){
    mostra "Ordem Crescente " + valor2 + ", " + valor3 + ", " + valor1;
}