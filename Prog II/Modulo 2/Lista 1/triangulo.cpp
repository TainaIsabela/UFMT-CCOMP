//  Crie a classe Triangulo, tendo como atributos sua base e altura
#include <iostream>
#include <cmath>


class Triangulo {
    public:
    float base;
    float altura;
    void calculaArea(Triangulo triangulo) {
    float area = (triangulo.base * triangulo.altura) / 2;
    printf("A área do triângulo é: %.2f\n", area);
}
};



int main (){
    std::cout << "Digite a base do triângulo: ";
    float base;
    std::cin >> base;
    std::cout << "Digite a altura do triângulo: ";
    float altura;
    std::cin >> altura;
    Triangulo triangulo;
    triangulo.base = base;
    triangulo.altura = altura;
    triangulo.calculaArea(triangulo);
    
}