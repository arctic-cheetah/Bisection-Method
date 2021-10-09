## JavaObject

```
JavaObject[class className]
```

> a `JavaObject` can be created with the `JavaNew` function.

**Note**: the Java specific functions which call Java native classes are only available in the MMA mode in a local installation. All symbol and method names have to be case sensitive.

### Examples

```
>> loc = JavaNew["java.util.Locale", "US"] 
JavaObject[class java.util.Locale]

>> ds =  JavaNew["java.text.DecimalFormatSymbols", loc]
JavaObject[class java.text.DecimalFormatSymbols]

>> dm = JavaNew["java.text.DecimalFormat", "#.00", ds]
JavaObject[class java.text.DecimalFormat]
```

Calls the `format` method of the `dm` Java object.

```
>> dm@format[0.815] // InputForm
".81"
```

### Related terms 
[InstanceOf](InstanceOf.md), [JavaClass](JavaClass.md), [JavaObject](JavaObject.md), [JavaObjectQ](JavaObjectQ.md), [JavaShow](JavaShow.md), [LoadJavaClass](LoadJavaClass.md), [SameObjectQ](SameObjectQ.md)