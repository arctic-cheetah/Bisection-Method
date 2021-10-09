## ArrayRules

```
ArrayRules(sparse-array)
```

> return the array of rules which define the sparse array.
 
```
ArrayRules(nested-lists)
```

> return the array of rules which define the nested lists.

### Examples

```  
>> a = {{{0,0},{1,1}},{{0,1},{0,1}}} 
{{{0,0},{1,1}},{{0,1},{0,1}}} 

>> ArrayRules(a) 
{{1,2,1}->1,{1,2,2}->1,{2,1,2}->1,{2,2,2}->1,{_,_,_}->0}
```

### Related terms
[SparseArray](SparseArray.md)

### Github

* [Implementation of ArrayRules](https://github.com/axkr/symja_android_library/blob/master/symja_android_library/matheclipse-core/src/main/java/org/matheclipse/core/builtin/SparseArrayFunctions.java#L72) 
