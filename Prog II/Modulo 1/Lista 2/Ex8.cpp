// Instituição: UFMT - Campus Araguaia
// Disciplina: Prog. II 
// Aluna: Tainá Isabela Monteiro da Silva - RGA: 202011722019


//  Escreva uma função que receba um vetor e duas variáveis max e min. A função deve retornar a
// posiçãao do vetor do valor máximo e garantir que as variáveis min e max contenham o menor e o
// maior valor do vetor, respectivamente. Escreva um programa para testar a função

#include <iostream>
#include <cstdlib>
#include <ctime>
int main()
{
    int vetor[10];
    int max, min;
    srand(time(NULL));
    for(int i = 0; i < 10; i++)
    {
        vetor[i] = rand() % 100;
    }
    for(int i = 0; i < 10; i++)
    {
        std::cout << vetor[i] << " ";
    }
    std::cout << std::endl;
    max = vetor[0];
    min = vetor[0];
    for(int i = 0; i < 10; i++)
    {
        if(vetor[i] > max)
        {
            max = vetor[i];
        }
        if(vetor[i] < min)
        {
            min = vetor[i];
        }
    }
    std::cout << "Maior valor: " << max << std::endl;
    std::cout << "Menor valor: " << min << std::endl;
    return 0;
}