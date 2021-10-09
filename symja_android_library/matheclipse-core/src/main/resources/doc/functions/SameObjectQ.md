## SameObjectQ

```
SameObjectQ[java-object1, java-object2]
```

> gives `True` if the Java `==` operator for the Java objects gives true. `False` otherwise.

**Note**: the Java specific functions which call Java native classes are only available in the MMA mode in a local installation. All symbol and method names have to be case sensitive.

### Examples

```
>> loc1= JavaNew["java.util.Locale","US"] 
JavaObject[class java.util.Locale]

>> loc2= JavaNew["java.util.Locale","US"] 
JavaObject[class java.util.Locale]

>> SameObjectQ[loc1, loc2]
False 

>> SameObjectQ[loc1, loc1] 
True
```

### Related terms 
[InstanceOf](InstanceOf.md), [JavaClass](JavaClass.md), [JavaNew](JavaNew.md), [JavaObject](JavaObject.md), [JavaObjectQ](JavaObjectQ.md)