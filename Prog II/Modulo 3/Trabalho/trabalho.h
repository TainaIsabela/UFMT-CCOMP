
#ifndef CLASSES_H
#define CLASSES_H
#include "stdbool.h"
#include "string.h"

#include <iostream>
#include <string>
#include <cmath>
using namespace std;

namespace trabalho
{
    class Transporte
    {
    private:
        string nome;
        int numPassageiros;
        int velocidadeAtual;

    public:
        Transporte(string nome, int numPassageiros, int velocidadeAtual);
        virtual bool estaParado()
        {
            if (velocidadeAtual == 0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }

        string getNome() { return nome; }
        int getNumPassageiros() { return numPassageiros; }
        int getVelocidadeAtual() { return velocidadeAtual; }
    };

    class aereo : Transporte
    {
    private:
        int altura;

    public:
        aereo(string nome, int numPassageiros, int velocidadeAtual, int altura);
        virtual void subir(int metros){};
        virtual void descer(int metros){};
        int getAltura() { return altura; }
    };

    class terrestre : Transporte
    {
    public:
        terrestre(string nome, int numPassageiros, int velocidadeAtual);
        void frear(int velocidadeAtual){};
    };

    class aviao : aereo
    {
    public:
        aviao(string nome, int numPassageiros, int velocidadeAtual, int altura);
    };

    class balao : aereo
    {
    public:
        balao(string nome, int numPassageiros, int velocidadeAtual, int altura);
    };

    class carro : terrestre
    {
    public:
        carro(string nome, int numPassageiros, int velocidadeAtual);
    };
}
#endif