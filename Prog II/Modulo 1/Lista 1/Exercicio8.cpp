// Instituição: UFMT - Campus Araguaia
// Disciplina: Prog. II 
// Aluna: Tainá Isabela Monteiro da Silva - RGA: 202011722019

// Escreva um programa que determine a porcentagem de desconto do imposto de renda de um sal´ario.
// Se maior que 5600, deve descontar 12%. Caso contr´ario, 10%.

#include <iostream>
int main () {
    float salario, imposto;
    std::cout << "Digite o salario: ";
    std::cin >> salario;
    if (salario > 5600) {
        imposto = salario * 0.12;
    } else {
        imposto = salario * 0.10;
    }
    std::cout << "O imposto de renda sera de: " << imposto << std::endl;
    return 0;
}