## Return

```
Return(expr)
```

> aborts a function call and returns `expr`.

### Examples

```
>> f(x_) := (If(x < 0, Return(0)); x)

>> f(-1)
0
 
>> Do(If(i > 3, Return()); Print(i), {i, 10})
 | 1
 | 2
 | 3
```

`Return` only exits from the innermost control flow construct.

```
>> g(x_) := (Do(If(x < 0, Return(0)), {i, {2, 1, 0, -1}}); x)

>> g(-1)
-1
 
>> h(x_) := (If(x < 0, Return()); x)

>> h(1)
1
 
>> h(-1) // FullForm
Null

>> f(x_) := Return(x)

>> g(y_) := Module({}, z = f(y); 2)

>> g(1)	 
2
```

### Github

* [Implementation of Return](https://github.com/axkr/symja_android_library/blob/master/symja_android_library/matheclipse-core/src/main/java/org/matheclipse/core/builtin/Programming.java#L2494) 
