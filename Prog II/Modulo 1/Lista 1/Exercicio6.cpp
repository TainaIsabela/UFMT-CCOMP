// Instituição: UFMT - Campus Araguaia
// Disciplina: Prog. II 
// Aluna: Tainá Isabela Monteiro da Silva - RGA: 202011722019

// Escreva um programa que leia um inteiro e informe se esse número é ou não perfeito.
// Um número perfeito é um número inteiro positivo, que é igual a soma de seus divisores.
// Exemplo: 6 = 1 + 2 + 3
#include <iostream>
int main()
{
    int numero;
    int soma = 0;
    std::cout << "Digite um numero: ";
    std::cin >> numero;
    for (int i = 1; i <= numero; i++)
    {
        if (numero % i == 0)
        {
            if (i == numero)
            {
                break;
            }
            else
            {
                soma += i;
            }
        }
    }
    if (soma == numero)
    {
        std::cout << "O numero " << numero << " e perfeito";
    }
    else
    {
        std::cout << "O numero " << numero << " nao e perfeito";
    }
    return 0;
}
