// Instituição: UFMT - Campus Araguaia
// Disciplina: Prog. II 
// Aluna: Tainá Isabela Monteiro da Silva - RGA: 202011722019

// Escreva um programa que exiba na tela os N primeiros n´umeros quadrados. Exemplo: Para N =
// 5, imprima 1, 4, 9, 16, 25
#include <iostream>
int main()
{
    int N, i;
    std::cout << "Digite um numero: ";
    std::cin >> N;
    for (i = 1; i <= N; i++)
    {
        std::cout << i * i << " ";
    }
    return 0;
}