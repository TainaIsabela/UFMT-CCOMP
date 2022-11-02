// Instituição: UFMT - Campus Araguaia
// Disciplina: Prog. II 
// Aluna: Tainá Isabela Monteiro da Silva - RGA: 202011722019

// Crie um programa que leia uma nota de 0 a 100 e converta a nota para uma escala de A a F de
// acordo com as seguintes regras:
// • Nota ≥ 90 : A
// • Nota ≥ 80 : B
// • Nota ≥ 70 : C
// • Nota ≥ 60 : D
// • Nota ≥ 40 : E
// • Nota < 40 : F

#include <iostream>
int main()
{
    int nota;
    std::cout << "Digite uma nota de 0 a 100: ";
    std::cin >> nota;
    if(nota > 100 || nota < 0){
        std::cout << "Nota invalida!" << std::endl;
        
    }
    else if (nota >= 90)
    {
        std::cout << "A" << std::endl;
    }
    else if (nota >= 80)
    {
        std::cout << "B" << std::endl;
    }
    else if (nota >= 70)
    {
        std::cout << "C" << std::endl;
    }
    else if (nota >= 60)
    {
        std::cout << "D" << std::endl;
    }
    else if (nota >= 40)
    {
        std::cout << "E" << std::endl;
    }
    else
    {
        std::cout << "F" << std::endl;
    }
    return 0;
}