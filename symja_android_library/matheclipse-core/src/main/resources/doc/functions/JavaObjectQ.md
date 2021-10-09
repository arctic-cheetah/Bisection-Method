## JavaObjectQ

```
JavaObjectQ[java-object]
```

> return `True` if `java-object` is a `JavaObject` expression.

**Note**: the Java specific functions which call Java native classes are only available in the MMA mode in a local installation. All symbol and method names have to be case sensitive.

### Examples

```
>> loc = JavaNew["java.util.Locale", "US"] 
JavaObject[class java.util.Locale]

>> JavaObjectQ[loc]
True
```

### Related terms 
[InstanceOf](InstanceOf.md), [JavaClass](JavaClass.md), [JavaNew](JavaNew.md), [JavaObject](JavaObject.md), [JavaShow](JavaShow.md), [LoadJavaClass](LoadJavaClass.md), [SameObjectQ](SameObjectQ.md)