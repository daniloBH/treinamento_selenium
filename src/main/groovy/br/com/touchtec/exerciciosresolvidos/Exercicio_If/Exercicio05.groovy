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
 * Escreva um programa que verifique a validade de uma senha fornecida 
 * pelo usuário. A senha válida é o número 1234. Devem ser mostradas as
 * seguintes mensagens:  
 * ACESSO PERMITIDO caso a senha seja válida.  
 * ACESSO NEGADO caso a senha seja inválida. 
 */
Integer senha = pedeInteiro(1234);
//Integer senha = 1234;

if (senha == 1234){
    mostra "ACESSO PERMITIDO";
}else{
    mostra "ACESSO NEGADO";
}