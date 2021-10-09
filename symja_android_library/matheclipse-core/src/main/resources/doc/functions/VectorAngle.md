## VectorAngle

```
VectorAngle(u, v)
```

> gives the angles between vectors `u` and `v`

### Examples

```
>> VectorAngle({1, 0}, {0, 1})
Pi/2

>> VectorAngle({1, 2}, {3, 1})
Pi/4

>> VectorAngle({1, 1, 0}, {1, 0, 1})
Pi/3

>> VectorAngle({0, 1}, {0, 1})
0
```

### Github

* [Implementation of VectorAngle](https://github.com/axkr/symja_android_library/blob/master/symja_android_library/matheclipse-core/src/main/java/org/matheclipse/core/builtin/LinearAlgebra.java#L4891) 
