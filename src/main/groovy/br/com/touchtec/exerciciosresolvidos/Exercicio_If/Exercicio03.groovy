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
 * As maçãs custam 0,30 cada se forem compradas menos do que uma
 * dúzia, e R$ 0,25 se forem compradas pelo menos doze. Escreva um
 * programa que leia o número de maçãs compradas, calcule e mostre o
 * valor total da compra.
 */

Integer maca = pedeInteiro();
Double valor1 = 0.30;
Double valor2 = 0.25;
if (maca < 12){
    mostra "Quantidade " + (maca * valor1);
}else{
    mostra "Quantidade " + (maca * valor2);
}