## OpenAppend

```
OpenAppend("file-name")
```

> opens a file and returns an OutputStream to which writes are appended.

### Examples

```
>> f = FileNameJoin({$TemporaryDirectory, \"test_open.txt\"})
/tmp/test_open.txt

>> str = OpenWrite(f);  

>> Write(str, x^2 - y^2)
 
>> Close(str);
```

`FilePrint` prints the file content:

```
>> FilePrint(f)
```

as:

```
x^2 - y^2 
```

```
>> str = OpenAppend(f); 

>> Write(str, x^2 + y^2) 

>> Close(str);
```

`FilePrint` prints the file content:

```
>> FilePrint(f)
```

as:

```
x^2 - y^2
x^2 + y^2 
```
 

### Github

* [Implementation of OpenAppend](https://github.com/axkr/symja_android_library/blob/master/symja_android_library/matheclipse-core/src/main/java/org/matheclipse/core/builtin/FileFunctions.java#L730) 
