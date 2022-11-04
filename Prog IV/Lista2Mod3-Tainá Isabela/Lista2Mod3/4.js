function forma(tipo) {
    this.tipo = tipo;

}

forma.prototype.getTipo = function () {
    console.log(`${this.tipo}`)
};


const Triangulo = {
    a: 35,
    b: 58,
    c: 77,

    getPerimetro() {
        const total = this.a + this.b + this.c
        console.log('Perimetro: ', total)
    }
}

Triangulo.prototype = Object.create(forma.prototype);
Triangulo.prototype.constructor = Triangulo;

const T1 = new Triangulo(69, 78, 44);
const T2 = new Triangulo(69, 78, 44);

T1.getPerimetro()
T2.getTipo()

