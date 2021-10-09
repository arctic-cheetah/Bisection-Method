## Signature

```
Signature(permutation-list)
```

> determine if the `permutation-list` has odd (`-1`) or even (`1`) parity. Returns `0` if two elements in the `permutation-list` are equal.
 
See
* [Wikipedia - Permutation](https://en.wikipedia.org/wiki/Permutation)

### Examples

```
>> Signature({1,2,3,4}) 
1

>> Signature({1,4,3,2}) 
-1

>> Signature({1,2,3,2}) 
0
```
 
### Github
* [Implementation of Signature](https://github.com/axkr/symja_android_library/blob/master/symja_android_library/matheclipse-core/src/main/java/org/matheclipse/core/builtin/Combinatoric.java#L2457) 
