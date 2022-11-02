// Instituição: UFMT - Campus Araguaia
// Disciplina: Prog. II 
// Aluna: Tainá Isabela Monteiro da Silva - RGA: 202011722019

// Uma companhia decidiu conceder bˆonus de 4% a todos os funcion´arios com menos de 5 anos na
// empresa e 5% para aqueles com mais de cinco anos. Escreva um programa que leia o sal´ario e o
// total de anos na empresa e informe quanto o funcion´ario vai ganhar de bˆonus.

#include <iostream>
int main(){
    float salario, bonus;
    int anos;
    std::cout << "Digite o salario: ";
    std::cin >> salario;
    std::cout << "Digite o total de anos na empresa: ";
    std::cin >> anos;
    if (anos < 5){
        bonus = salario * 0.04;
    }
    else{
        bonus = salario * 0.05;
    }
    std::cout << "O bônus será de: " << bonus << std::endl;
    return 0;
}