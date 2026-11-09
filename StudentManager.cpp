#include <iostream>
#include <vector>
#include <string>

using namespace std;

// Issue: Unused variable (global)
int unusedGlobal = 100;

int main() {
    // Issue: Poor variable names (v, n, m)
    vector<string> v;
    vector<int> m;
    
    // Issue: Hardcoded values
    int limit = 100; 

    while (true) {
        cout << "1. Add\n2. Average\n3. Highest\n4. Exit\n";
        int choice;
        cin >> choice;

        if (choice == 1) {
            cout << "Enter name: ";
            string name;
            cin >> name;
            v.push_back(name);
            cout << "Enter marks: ";
            int marks;
            cin >> marks;
            m.push_back(marks);
        } 
        else if (choice == 2) {
            int sum = 0;
            for (int i = 0; i < m.size(); i++) {
                sum += m[i];
            }
            // Issue: Bug (Division by zero if no students)
            int avg = sum / m.size(); 
            cout << "Average: " << avg << endl;
        } 
        else if (choice == 3) {
            // Issue: Duplicate logic and hardcoded starting value
            int highest = 0; 
            for (int i = 0; i < m.size(); i++) {
                if (m[i] > highest) {
                    highest = m[i];
                }
            }
            cout << "Highest: " << highest << endl;
        } 
        else if (choice == 4) {
            // Issue: Duplicate loop code
            int highest = 0;
            for (int i = 0; i < m.size(); i++) {
                if (m[i] > highest) {
                    highest = m[i];
                }
            }
            for (int i = 0; i < v.size(); i++) {
                cout << v[i] << " : " << m[i] << endl;
            }
        } 
        else {
            break;
        }
    }
    return 0;
}