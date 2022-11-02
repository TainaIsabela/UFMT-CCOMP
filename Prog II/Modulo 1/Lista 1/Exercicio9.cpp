// Instituição: UFMT - Campus Araguaia
// Disciplina: Prog. II 
// Aluna: Tainá Isabela Monteiro da Silva - RGA: 202011722019

// Dada a equação:
// f(x) = x^2 - x / x, se x ≥ 1
// 0, caso contrário
// faça um programa que leia x e retorne f(x).


#include <iostream>
#include <cmath>
int main () {
    float x;
    std::cout << "Digite um valor para x: ";
    std::cin >> x;
    if (x >= 1) {
        std::cout << "f(x) = " << (pow(x,2)-x/x) << std::endl;
    } else {
        std::cout << "f(x) = " << 0 << std::endl;
    }
    return 0;
}

