#include <iostream>
#include <string>
#include <cmath>

using namespace std;

class Data
{
private:
    int dia, mes, ano;

public:
    Data(int d, int m, int a)
    {
        dia = d;
        mes = m;
        ano = a;
    }
    int getDia() { return dia; }
    int getMes() { return mes; }
    int getAno() { return ano; }
    int ultimoDiaMes()
    {
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
        {
            return 31;
        }
        else if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
        {
            return 30;
        }
        else if (mes == 2)
        {
            if (ano % 4 == 0)
            {
                return 29;
            }
            else
            {
                return 28;
            }
        }
    }
    string imprime()
    {
        string dia, mes, ano;
        dia = to_string(this->dia);
        mes = to_string(this->mes);
        ano = to_string(this->ano);
        return dia + "/" + mes + "/" + ano;
    }

    bool operator==(Data d)
    {
        if (this->dia == d.getDia() && this->mes == d.getMes() && this->ano == d.getAno())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    Data operator++()
    {
        if (this->dia < ultimoDiaMes())
        {
            this->dia++;
        }
        else
        {
            this->dia = 1;
            if (this->mes < 12)
            {
                this->mes++;
            }
            else
            {
                this->mes = 1;
                this->ano++;
            }
        }
        return *this;
    }

    Data operator+(int n)
    {
        Data d(this->dia, this->mes, this->ano);
        this->dia += n;
        return d;
    }
};

int main()
{
    Data d1(1, 1, 2000);
    Data d2(1, 1, 2000);
    Data d3(4, 4, 2012);
    cout << d1.imprime() << endl;
    cout << d1.ultimoDiaMes() << endl;
    cout << d1.getDia() << endl;
    cout << d1.getMes() << endl;
    cout << d1.getAno() << endl;
    cout << d1.operator==(d2) << endl;
    cout << d1.operator==(d3) << endl;
    d1.operator++();
    cout << d1.imprime() << endl;
    d3.operator+(2);
    cout << d3.imprime() << endl;

    return 0;
}