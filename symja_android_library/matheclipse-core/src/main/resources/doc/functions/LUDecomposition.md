## LUDecomposition

```
LUDecomposition(matrix)
```

> calculate the LUP-decomposition of a square `matrix`.
 
See:    
* [Wikipedia - LU decomposition](https://en.wikipedia.org/wiki/LU_decomposition)
* [Commons Math - Class FieldLUDecomposition](http://commons.apache.org/proper/commons-math/apidocs/org/apache/commons/math3/linear/FieldLUDecomposition.html)
 
### Examples

```
>> LUDecomposition[{{1, 2, 3}, {3, 4, 11}, {13, 7, 8}}]
{{{1,0,0},
  {3,1,0},
  {13,19/2,1}},
 {{1,2,3},
  {0,-2,2},
  {0,0,-50}},{1,2,3}}
```

### Github

* [Implementation of LUDecomposition](https://github.com/axkr/symja_android_library/blob/master/symja_android_library/matheclipse-core/src/main/java/org/matheclipse/core/builtin/LinearAlgebra.java#L2918) 
