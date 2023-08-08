# Projection Linear Algebra Calculator
_____

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

## Development Technologies
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)


_____


<a name="info"></a>
## General Information

The following describe the user stories for this program:
1. I want to calculate the projection of one vector onto another.
2. I want to calculate the subtraction of one vector from another.
3. I want to calculate the cross product of two vectors.
4. I want a console interface to input and be able to see the result.

The following use cases complement the user stories mentioned:
1. Projection
* Calculate projection of one vector _u_ onto _v_.
2. Subtraction
* Calculate the subtraction of one vector _v_ from _u_.
3. Cross Product
* Calculate cross product of vector _u_ and _v_.

The code does not violate any SOLID principles. Although not concretely having an entity, the VectorOperations acts like one. Otherwise the program follows clean architecture.

There were code smell concerns initially, but they were effectively addressed through refactoring. The application caters to the user stories by providing the requested vector calculations through dedicated use case classes.
