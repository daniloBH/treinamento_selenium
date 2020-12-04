package br.com.touchtec.Hierarquia



Carro peugeotDoIssao = new Carro()
peugeotDoIssao.getNumChassi()
peugeotDoIssao.setCor("Prata")
println(peugeotDoIssao.getCor())



Pista pista = new Pista()
println pista.determinaVelocidade(peugeotDoIssao)
     /** objeto.metodoOuFunçao(parametro) /
/** Criar a classe Moto como exemplo*/


Moto motoca = new Moto();
motoca.setTemBau(true);
pista.determinaVelocidade(motoca);

/**
 * Cuidados com Hierarquias:
 * Pode ficar bem difícil de entender e manter o código quando se tem uma 'árvore' de classes muito comprida
 * Boas práticas dizem que deveriam se ter menos de 7 camadas
 * Portanto esse é um recurso que deve ser utilizado com cuidado! (Dicas do Titio Issao)
 */
