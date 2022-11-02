// Instituição: UFMT - Campus Araguaia
// Disciplina: Prog. II 
// Aluna: Tainá Isabela Monteiro da Silva - RGA: 202011722019

// Escreva um programa que leia o valor inicial, a quantidade de termos e a razão de uma progressão aritmética e exiba na tela a sequência correspondente a essa entrada.
#include <iostream>
int main()
{
    int inicio, fim, razao;
    std::cout << "Digite o valor inicial: ";
    std::cin >> inicio;
    std::cout << "Digite o valor final: ";
    std::cin >> fim;
    std::cout << "Digite a razão: ";
    std::cin >> razao;
    for (int i = inicio; i <= fim; i += razao)
    {
        std::cout << i << " ";
    }
    return 0;
}