const game = ['Pedra', 'Papel', 'Tesoura']
const escolha = prompt("Escolha um elemento")
const escolhaC = game[Math.floor(Math.random() * game.length)]

if (escolha == escolhaC) {
    console.log('Empate')
    console.log('Escolha do usuário:',escolha, '\nEscolha do Computador:',escolhaC)
}
if (escolha == 'Papel' && escolhaC == 'Pedra') {
    console.log('Usuário Venceu')
    console.log('Escolha do usuário:',escolha, '\nEscolha do Computador:',escolhaC)
}
if (escolha == 'Pedra' && escolhaC == 'Papel') {
    console.log('Computador Venceu')
    console.log('Escolha do usuário:',escolha, '\nEscolha do Computador:',escolhaC)
}
if (escolha == 'Tesoura' && escolhaC == 'Pedra') {
    console.log('Computador Venceu')
    console.log('Escolha do usuário:',escolha, '\nEscolha do Computador:',escolhaC)
}
if (escolha == 'Pedra' && escolhaC == 'Tesoura') {
    console.log('Usuário Venceu')
    console.log('Escolha do usuário:',escolha, '\nEscolha do Computador:',escolhaC)
}
if (escolha == 'Tesoura' && escolhaC == 'Papel') {
    console.log('Usuário Venceu')
    console.log('Escolha do usuário:',escolha, '\nEscolha do Computador:',escolhaC)
}
if (escolha == 'Papel' && escolhaC == 'Tesoura') {
    console.log('Usuário Venceu')
    console.log('Escolha do usuário:',escolha, '\nEscolha do Computador:',escolhaC)
}