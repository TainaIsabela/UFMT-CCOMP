// Instituição: UFMT - Campus Araguaia
// Disciplina: Prog. II 
// Aluna: Tainá Isabela Monteiro da Silva - RGA: 202011722019

// Escreva um programa que exiba a somatória dos N primeiros números pares.
#include <iostream>
int main() {
    int n, soma = 0;
    std::cout << "Digite um número: ";
    std::cin >> n;
    for (int i = 0; i <= n; i++) {
        if (i % 2 == 0) {
            soma += i;
        }
    }
    std::cout << "A soma dos números pares é: " << soma << std::endl;
    return 0;
}
