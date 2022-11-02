#include <iostream>
#include "trabalho.h"

using namespace std;

namespace trabalho
{
    using trabalho::aereo;
    using trabalho::aviao;
    using trabalho::balao;
    using trabalho::carro;
    using trabalho::terrestre;
    using trabalho::Transporte;

    trabalho::Transporte::Transporte(string nome, int numPassageiros, int velocidadeAtual)
    {
        this->nome = nome;
        this->numPassageiros = numPassageiros;
        this->velocidadeAtual = velocidadeAtual;

        cout << "Construtor da classe Transporte" << endl;
    }
    trabalho::aereo::aereo(string nome, int numPassageiros, int velocidadeAtual, int altura) : Transporte(nome, numPassageiros, velocidadeAtual)
    {
        this->altura = altura;

        cout << "Construtor da classe aereo" << endl;
    }
    trabalho::terrestre::terrestre(string nome, int numPassageiros, int velocidadeAtual) : Transporte(nome, numPassageiros, velocidadeAtual)
    {

        cout << "Construtor da classe terrestre" << endl;
    }
    trabalho::aviao::aviao(string nome, int numPassageiros, int velocidadeAtual, int altura) : aereo(nome, numPassageiros, velocidadeAtual, altura)
    {

        cout << "Construtor da classe aviao" << endl;
    }
    trabalho::balao::balao(string nome, int numPassageiros, int velocidadeAtual, int altura) : aereo(nome, numPassageiros, velocidadeAtual, altura)
    {

        cout << "Construtor da classe balao" << endl;
    }
    trabalho::carro::carro(string nome, int numPassageiros, int velocidadeAtual) : terrestre(nome, numPassageiros, velocidadeAtual)
    {

        cout << "Construtor da classe carro" << endl;
    }
    void trabalho::aereo::subir(int metros)
    {
        if (metros < 1000)
        {
            this->altura += metros;
        }
        else
        {
            cout << "Nao eh possivel subir" << endl;
        }
    }

    void trabalho::aereo::descer(int metros)
    {
        if (metros > 0)
        {
            this->altura -= metros;
        }
        else
        {
            cout << "Nao eh possivel descer" << endl;
        }
    }

    void trabalho::terrestre::frear(int velocidadeAtual)
    {
        if (velocidadeAtual > 0)
        {
            velocidadeAtual = velocidadeAtual * 0.75;
        }
        else
        {
            cout << "Nao eh possivel frear" << endl;
        }
    }
}
