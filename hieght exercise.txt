#include <iostream>
#include <cmath>
using namespace std;

int main() {
    double hInches, dFeet, dInches, angleDegrees;


    cout << "Enter the height of your eye (in inches): ";
    cin >> hInches;

    cout << "Enter the distance from the tree (feet and inches separated by a space): ";
    cin >> dFeet;

    cout<<"Enter The distance in inches:";
    cin>> dInches;

    cout << "Enter the angle between the horizontal and the line to the top of the tree (in degrees): ";
    cin >> angleDegrees;


    double dTotalInches = dFeet * 12 + dInches;


    double angleRadians = angleDegrees * M_PI /180;


    double treeHeightFeet = (hInches/12) + (dTotalInches * tan(angleRadians))/12;


    cout << "The height of the tree is approximately " << treeHeightFeet << " feet.";

    return 0;
}
