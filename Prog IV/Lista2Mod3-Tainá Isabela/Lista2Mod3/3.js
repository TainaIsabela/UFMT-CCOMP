function grow() {
    this.value = (this.value * 0.5) + this.value;
}

const Produto = {
    value: 50
}

const P1 = Object.create(Produto);

grow.call(P1)

console.log(P1.value)