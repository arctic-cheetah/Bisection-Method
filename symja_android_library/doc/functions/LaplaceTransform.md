## LaplaceTransform

```
LaplaceTransform(f,t,s)
```

> returns the laplace transform.
 
See:
* [Wikipedia - Laplace transform](https://en.wikipedia.org/wiki/Laplace_transform)

### Examples

```
>> LaplaceTransform(t^2*Exp(2+3*t), t, s)
(-2*E^2)/(3-s)^3
```

### Github

* [Implementation of LaplaceTransform](https://github.com/axkr/symja_android_library/blob/master/symja_android_library/matheclipse-core/src/main/java/org/matheclipse/core/reflection/system/LaplaceTransform.java#L38) 
