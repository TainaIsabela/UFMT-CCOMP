// Instituição: UFMT - Campus Araguaia
// Disciplina: Prog. II 
// Aluna: Tainá Isabela Monteiro da Silva - RGA: 202011722019

// Escreva um programa em C++ que leia N números do teclado e apresente a somatória e a média aritmética dos números digitados.
#include <iostream>
int main()
{
    int n, i, soma = 0, media;
    std::cout << "Digite o numero de numeros: ";
    std::cin >> n;
    for (i = 0; i < n; i++)
    {
        std::cout << "Digite o numero: ";
        std::cin >> soma;
    }
    media = soma / n;
    std::cout << "A soma dos numeros e: " << soma << std::endl;
    std::cout << "A media dos numeros e: " << media << std::endl;
    return 0;
}