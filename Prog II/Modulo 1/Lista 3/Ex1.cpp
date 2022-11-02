// Instituição: UFMT - Campus Araguaia
// Disciplina: Prog. II 
// Aluna: Tainá Isabela Monteiro da Silva - RGA: 202011722019
#include <iostream>
#include <vector>
#include <memory>

void read_vector(std::vector<int> &v)
{
    int n;
    std::cout << "Digite o tamanho do vetor: ";
    std::cin >> n;
    v.resize(n);
    for (int i = 0; i < n; i++)
    {
        std::cout << "Digite o valor " << i + 1 << ": ";
        std::cin >> v[i];
    }
}

void print_vector(const std::vector<int> &v)
{
    for (int i = 0; i < v.size(); i++)
    {
        std::cout << v[i] << " ";
    }
    std::cout << std::endl;
}
int main()
{
    std::vector<int> v;
    read_vector(v);
    print_vector(v);
    return 0;
}
