## Mod

```
Mod(x, m)
```

> returns `x` modulo `m`.
 
See
* [Wikipedia - Modulo_operation](https://en.wikipedia.org/wiki/Modulo_operation)

### Examples

```
>> Mod(14, 6)
2
>> Mod(-3, 4)
1
>> Mod(-3, -4)
-3
```

The argument 0 should be nonzero

```
>> Mod(5, 0) 
Mod(5, 0)
```

### Github

* [Implementation of Mod](https://github.com/axkr/symja_android_library/blob/master/symja_android_library/matheclipse-core/src/main/java/org/matheclipse/core/builtin/IntegerFunctions.java#L1029) 
