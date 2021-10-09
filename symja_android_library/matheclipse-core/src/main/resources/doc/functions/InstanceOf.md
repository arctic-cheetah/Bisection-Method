## InstanceOf

```
InstanceOf[java-object, "class-name"]
```

> return the result of the Java expression `java-object instanceof class`.

**Note**: the Java specific functions which call Java native classes are only available in the MMA mode in a local installation. All symbol and method names have to be case sensitive.

### Examples

```
>> loc = JavaNew["java.util.Locale", "US"] 
JavaObject[class java.util.Locale]

>> InstanceOf[loc, "java.util.Locale"]
True

>> InstanceOf[loc, "java.io.Serializable"] 
True
```

### Related terms 
[JavaClass](JavaClass.md), [JavaNew](JavaNew.md), [JavaObject](JavaObject.md), [JavaObjectQ](JavaObjectQ.md), [LoadJavaClass](LoadJavaClass.md), [SameObjectQ](SameObjectQ.md)