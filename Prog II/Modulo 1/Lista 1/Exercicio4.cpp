// Instituição: UFMT - Campus Araguaia
// Disciplina: Prog. II 
// Aluna: Tainá Isabela Monteiro da Silva - RGA: 202011722019

// Escreva um programa que calcule o fatorial de um inteiro positivo informado pelo teclado.
#include <iostream>
int main (){
    int n, fatorial = 1;
    std::cout << "Digite um numero: ";
    std::cin >> n;
    for (int i = 1; i <= n; i++){
        fatorial = fatorial * i;
    }
    std::cout << "O fatorial de " << n << " é " << fatorial << std::endl;
    return 0;
}