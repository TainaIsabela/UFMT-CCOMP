#include <iostream>
#include <memory>

using namespace std;

int main() {
auto p = make_shared<int>(42);
auto q = p;
auto X = q;
 
p = nullptr;
 
cout << q.use_count() <<endl;
 
}