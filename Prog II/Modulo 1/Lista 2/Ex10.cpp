// Instituição: UFMT - Campus Araguaia
// Disciplina: Prog. II 
// Aluna: Tainá Isabela Monteiro da Silva - RGA: 202011722019


// Escreva uma função de nome incrementa que receba como argumento um inteiro e adicione mais
// um ao seu valor. Escreva um programa que imprima a variável passada antes e depois da chamada
// da função.
#include <iostream>
using namespace std;

void incrementa(int &x) {
    x++;
}

int main(){
    int x;
    cout << "Digite um numero: ";
    cin >> x;
    cout << "Antes: " << x << endl;
    incrementa(x);
    cout << "Depois: " << x << endl;
    return 0;
}