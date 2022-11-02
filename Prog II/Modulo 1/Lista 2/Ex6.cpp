// Instituição: UFMT - Campus Araguaia
// Disciplina: Prog. II 
// Aluna: Tainá Isabela Monteiro da Silva - RGA: 202011722019

// Crie uma estrutura representando um retângulo, que armazene sua altura e largura. Crie uma
// função que receba tal estrutura e retorne a área do retângulo passado como parâmetro.

#include <iostream>
int main() {
    struct retangulo {
        int altura;
        int largura;
    };
    retangulo r;
    std::cout << "Digite a altura do retangulo: ";
    std::cin >> r.altura;
    std::cout << "Digite a largura do retangulo: ";
    std::cin >> r.largura;
    std::cout << "A area do retangulo e: " << r.altura * r.largura << std::endl;
    return 0;
}