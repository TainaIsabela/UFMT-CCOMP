function welcome(a) {
    if (a == 1) {
        return console.log('Seja bem vindo')
    } if (a == 0) {
        return console.log('Tente novamente')
    }
}

function juntando(a, nome) {
    return console.log(`${welcome(a)} ${nome}`)
}

juntando(1, "taina")