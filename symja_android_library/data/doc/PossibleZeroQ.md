## PossibleZeroQ

```
PossibleZeroQ(expr)
```

> returns `True` if basic symbolic and numerical methods suggest that `expr` has value zero, and `False` otherwise.

 
### Examples

Test whether a numeric expression is zero:

```
>> PossibleZeroQ((x + 1) (x - 1) - x^2 + 1)
True
```

The determination is approximate.
    
Test whether a symbolic expression is likely to be identically zero:

```
>> PossibleZeroQ((x + 1) (x - 1) - x^2 + 1)
True

>> PossibleZeroQ(1/x + 1/y - (x + y)/(x y))
True
```

Decide that a numeric expression is zero, based on approximate computations:

```
>> PossibleZeroQ(2^(2*I) - 2^(-2*I) - 2*I*Sin(Log(4)))
True

>> PossibleZeroQ((E + Pi)^2 - E^2 - Pi^2 - 2*E*Pi)
True

>> PossibleZeroQ(Sqrt(x^2) - x)
False
```
### Github
* [Implementation of PossibleZeroQ](https://github.com/axkr/symja_android_library/blob/master/symja_android_library/matheclipse-core/src/main/java/org/matheclipse/core/builtin/PredicateQ.java#L983) 
