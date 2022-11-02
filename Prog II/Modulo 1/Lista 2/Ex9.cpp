// Instituição: UFMT - Campus Araguaia
// Disciplina: Prog. II 
// Aluna: Tainá Isabela Monteiro da Silva - RGA: 202011722019


// Escreva uma fun¸c˜ao void que receba dois valores inteiros como parˆametro e troque-os entre eles.
// Escreva um programa que teste a fun¸c˜ao, exibindo os valores antes e depois de sua chamada.
#include <iostream>
using namespace std;
void troca(int &a, int &b){
    int aux = a;
    a = b;
    b = aux;
}

int main()
{
    int a, b;
    cout << "Digite o primeiro valor: ";
    cin >> a;
    cout << "Digite o segundo valor: ";
    cin >> b;
    cout << "Valores antes da troca: " << a << " e " << b << endl;
    troca(a, b);
    cout << "Valores depois da troca: " << a << " e " << b << endl;
    return 0;
}