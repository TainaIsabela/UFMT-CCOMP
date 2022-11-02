#include <iostream>
#include <string>
#include <cmath>
using namespace std;

template <typename T>
T maximum(T a, T b)
{
    if (a > b)
    {
        return a;
    }
    else
    {
        return b;
    }
}

class Pair
{
private:
    int first;
    int second;

public:
    Pair(const int &t, const int &u)
        : first(t), second(u)
    {
    }
    int &get_first() { return first; }
    int &get_second() { return second; }
    const int &get_first() const { return first; }
    const int &get_second() const { return second; }
};
void print_pair(const Pair &p)
{
    std::cout << '(' << p.get_first() << ", " << p.get_second() << ")\n";
}
void add_pairs(Pair &p)
{
    if (typeid(p.get_first()) == typeid(string) && typeid(p.get_second()) == typeid(string))
    {
        p.get_first() = p.get_first() + p.get_second();
        p.get_second() = p.get_first();
        std::cout << p.get_first() << '\n';
    }
    else if (typeid(p.get_first()) == typeid(int) && typeid(p.get_second()) == typeid(int))
    {
        p.get_first() = p.get_first() + p.get_second();
        p.get_second() = p.get_first();
        std::cout << p.get_first() << '\n';
    }

}
int main()
{
    int i;
    string y;

    i = maximum<int>(1, 2);
    cout << "O valor mais alto é " << i << endl;

    y = maximum<char*>("4", "7");
    cout << "O valor mais alto é " << y << endl;

    i = maximum<double>(1.8, 3.3);
    cout << "O valor mais alto é " << i << endl;


    Pair p1(1, 2), p2('3', '4'), p3(8.4, 9.9);
    print_pair(p1);
    print_pair(p2);
    print_pair(p3);
    std::cout << "Somando os valores de p1 e p2:\n";
    add_pairs(p1);
    add_pairs(p2);
    }