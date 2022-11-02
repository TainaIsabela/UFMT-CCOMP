// Instituição: UFMT - Campus Araguaia
// Disciplina: Prog. II 
// Aluna: Tainá Isabela Monteiro da Silva - RGA: 202011722019


// Escreva uma função para o cálculo da distância entre dois pontos no plano cartesiano. Os dois
// pontos passados na função como argumentos devem ser expressados na forma de uma struct. Crie
// um programa que leia as coordenadas x e y do teclado para ambos os pontos e mostre na tela a
// distância resultante.
# include <iostream>
# include <cmath>
using namespace std;
int main()
{
    struct point
    {
        float x, y;
    };
    point p1, p2;
    cout << "Digite as coordenadas do primeiro ponto: ";
    cin >> p1.x >> p1.y;
    cout << "Digite as coordenadas do segundo ponto: ";
    cin >> p2.x >> p2.y;
    cout << "A distancia entre os dois pontos e: " << sqrt(pow(p2.x - p1.x, 2) + pow(p2.y - p1.y, 2)) << endl;
    return 0;
}
