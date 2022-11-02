// Instituição: UFMT - Campus Araguaia
// Disciplina: Prog. II 
// Aluna: Tainá Isabela Monteiro da Silva - RGA: 202011722019

// Escreva um programa para ler uma frase do teclado e imprimir na tela a quantidade de palavras
// que foram digitadas.
#include <iostream>
#include <string>
int main()
{
    std::string frase;
    std::cout << "Digite uma frase: ";
    std::getline(std::cin, frase);
    int cont = 0;
    for (int i = 0; i < frase.size(); i++)
    {
        if (frase[i] == ' ')
        {
            cont++;
        }
    }
    cont++;
    std::cout << "A frase tem " << cont << " palavras." << std::endl;
    return 0;
}
