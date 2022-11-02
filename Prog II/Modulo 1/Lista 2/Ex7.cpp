// Instituição: UFMT - Campus Araguaia
// Disciplina: Prog. II 
// Aluna: Tainá Isabela Monteiro da Silva - RGA: 202011722019

// Crie uma estrutura representando um triângulo, que contenha o tamanho de cada um de seus três
// lados. Crie um programa que leia os três lados do triângulo de um objeto desta estrutura e informe
// se o triângulo é escaleno ou não.
#include <iostream>
int main () {
    struct triangulo {
        int lado1;
        int lado2;
        int lado3;
    };
    triangulo t;
    std::cout << "Digite o tamanho do primeiro lado: ";
    std::cin >> t.lado1;
    std::cout << "Digite o tamanho do segundo lado: ";
    std::cin >> t.lado2;
    std::cout << "Digite o tamanho do terceiro lado: ";
    std::cin >> t.lado3;
    if (t.lado1 + t.lado2 > t.lado3 && t.lado1 + t.lado3 > t.lado2 && t.lado2 + t.lado3 > t.lado1) {
        if (t.lado1 != t.lado2 && t.lado1 != t.lado3 && t.lado2 != t.lado3) {
            std::cout << "Triangulo escaleno" << std::endl;
        } else {
            std::cout << "Triangulo isosceles" << std::endl;
        }
    } else {
        std::cout << "Triangulo nao formado" << std::endl;
    }
    return 0;
}

// Dei uma incrementada para a função dizer se corresponde a outros tipos de triangulos ou não.
