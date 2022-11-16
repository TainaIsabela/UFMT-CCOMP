function mensagem() {
    console.log('Olá');

    return function () {
        console.log('Tudo bem?');
    };

}

const a = mensagem();
a();
