#include <iostream>
#include <string>
#include <cmath>
#include "trabalho.h"
#include "trabalho.cpp"
#include "string.h"

using namespace std;

int main()
{
    using namespace trabalho;

    aviao Aviao("Aviao", 100, 0, 1000);
    balao Balao("Balao", 100, 0, 1000);
    carro Carro("Carro", 4, 0);

    cout << "Altura do aviao: " << Aviao.getAltura() << endl;
    Aviao.subir(100);
    cout << "Altura do aviao: " << Aviao.getAltura() << endl;
    cout << "Altura do balao: " << Balao.getAltura() << endl;
    Balao.subir(100);
    cout << "Altura do balao: " << Balao.getAltura() << endl;
    cout << "Velocidade do carro: " << Carro.getVelocidadeAtual() << endl;
    Carro.frear();
    cout << "Velocidade do carro: " << Carro.getVelocidadeAtual() << endl;
}
