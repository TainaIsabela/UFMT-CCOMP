#include <iostream>
#include <cmath>
#include <string>

using namespace std;

class lampada {
public:
    bool ligada;
    string tipo;
    int voltagem;
    int potencia;

    void ligar() {
        ligada = true;
    }
    void desligar() {
        ligada = false;
    }
    void status() {
        if (ligada) {
            std::cout << "Ligada" << std::endl;
        } else {
            std::cout << "Desligada" << std::endl;
        }
    }

    bool ehEconomica() {
        if (potencia <= 40) {
            std::cout << "Lampada eh economica" << std::endl;
            return true;
        } else {
            std::cout << "Lampada nao eh economica" << std::endl;
            return false;
        }
    }
};

int main() {
    lampada lamp;
    lamp.ligada = true;
    lamp.tipo = "incandescente";
    lamp.voltagem = 110;
    lamp.potencia = 40;
    lamp.ligar();
    lamp.status();
    lamp.desligar();
    lamp.status();
    lamp.ehEconomica();
    return 0;
}