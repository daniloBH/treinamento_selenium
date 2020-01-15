package br.com.touchtec.Mapas.Exercicios

import javax.swing.JFrame
import javax.swing.JOptionPane

/**
 * Ignorar essa parte aqui!
 */
def mostra = { def texto ->
    JFrame frame = new JFrame()
    String answer = JOptionPane.showMessageDialog(frame, texto.toString())
    frame.dispose()
    return answer
}

def mostraMapa = { def map ->
    String texto = ""
    map.each{
        texto += "$it.key : $it.value\r\n"
    }
    mostra(texto)
}

/**
 * Exercicio 3: Dia do Aumento!
 *
 *  Ótimas notícias do RH, vai ter aumento pra geral!!! (Exceto estagiário)
 *  Mas nem todos vão ganhar o mesmo aumento, segue abaixo os valores para cada cargo:
 *  1) Analistas terão um aumento de 600
 *  2) Desenvolvedores terão um aumento de 800
 *  3) Gerentes terão um aumento de 1000
 *
 *  Percorra a lista de Funcionarios e atualize o salário de todos, no fim de tudo utilize o mostraMapa()
 *  Obs.: Lembre-se do for() que usamos para listas
 */
def funcionario1 = [nome: "Roberto", cargo: "Analista Júnior", salario: 3000]
def funcionario2 = [nome: "Catarina", cargo: "Gerente de TI", salario: 8000]
def funcionario3 = [nome: "Lindomar", cargo: "Desenvolvedor Pleno", salario: 5000]
def funcionario4 = [nome: "Fabinho", cargo: "Estagiário", salario: 10]
def funcionario5 = [nome: "Péricles", cargo: "Desenvolvedor Sênior", salario: 6200]

def listaFuncionários = [funcionario1, funcionario2, funcionario3, funcionario4, funcionario5]

 for (def funcionario : listaFuncionários) {
    if (funcionario['cargo'] == 'Analista Júnior'){
        funcionario ['salario'] = funcionario['salario'] + 600
        mostraMapa (funcionario)
    }
     if (funcionario ['cargo'] == 'Desenvolvedor Pleno'|| funcionario['cargo'] == 'Desenvolvedor Sênior'){
         funcionario['salario'] = funcionario ['salario'] + 800
         mostraMapa (funcionario)
     }
     if (funcionario ['cargo'] == 'Gerente de TI'){
         funcionario ['salario'] = funcionario ['salario'] + 1000
         mostraMapa (funcionario)
     }
 }