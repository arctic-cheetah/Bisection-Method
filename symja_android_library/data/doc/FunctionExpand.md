## FunctionExpand

```
FunctionExpand(expression) 
```

> expands the special function `expression`. `FunctionExpand` expands simple nested radicals.

See
* [Wikipedia - Nested radical](https://en.wikipedia.org/wiki/Nested_radical) 

### Examples

```  
>> FunctionExpand(Beta(10, b))
362880/(b*(1+b)*(2+b)*(3+b)*(4+b)*(5+b)*(6+b)*(7+b)*(8+b)*(9+b))

>> FunctionExpand(Sqrt(5 + 2*Sqrt(6)))
Sqrt(2)+Sqrt(3)
```
### Github
* [Implementation of FunctionExpand](https://github.com/axkr/symja_android_library/blob/master/symja_android_library/matheclipse-core/src/main/java/org/matheclipse/core/reflection/system/FunctionExpand.java#L67) 
