#include <iostream>
#include <string>
#include <cmath>
using namespace std;
class partida {
    public:
    string nomeTime;
    int gols;
    int pontuacao;
    string nomeTimeRival;
    int golsRival;
    int pontuacaoRival;

    void resultado(string nomeTime, int gols, string nomeTimeRival, int golsRival) {
    nomeTime = nomeTime;
    gols = gols;
    nomeTimeRival = nomeTimeRival;
    golsRival = golsRival;

    }
    void calculaPontos() {
        if (gols > golsRival) {
            pontuacao = 3;
        } else if (gols < golsRival) {
            pontuacao = 0;
        } else {
            pontuacao = 1;
        }
        if (golsRival > gols) {
            pontuacaoRival = 3;
        } else if (golsRival < gols) {
            pontuacaoRival = 0;
        } else {
            pontuacaoRival = 1;
        }
    }

    void mostraResultado () {
        cout << nomeTime << " " << gols << " x " << golsRival << " " << nomeTimeRival << endl;
    }
};

int main (){
    partida partida;
    partida.nomeTime = "Palmeiras";
    partida.gols = 3;
    partida.nomeTimeRival = "Santos";
    partida.golsRival = 1;
    partida.resultado(partida.nomeTime, partida.gols, partida.nomeTimeRival, partida.golsRival);
    partida.calculaPontos();
    partida.mostraResultado();
    return 0;
}