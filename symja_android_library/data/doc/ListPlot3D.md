## ListPlot3D

```
ListPlot3D( { list-of-points } )  
```

> generate a JavaScript list plot 3D control for the `list-of-points`.
	 
**Note**: This feature is available in the console app and in the web interface.

### Examples

In the console apps, this command shows an HTML page with a JavaScript list plot control.
 
```
>> Manipulate(ListPlot3D(Table({Sin(t), Cos(t*a), Cos(t^2) }, {t, 500})), {a,1,4,1})
```

With `JSForm` you can display the generated JavaScript form of the `Manipulate` function

```
>> Manipulate(ListPlot3D(Table({Sin(t), Cos(t*a), Cos(t^2) }, {t, 500})), {a,1,4,1}) // JSForm
```

### Related terms 
[JSForm](JSForm.md) [Manipulate](Manipulate.md) [ParametricPlot](ParametricPlot.md) [Plot](Plot.md)  [Plot3D](Plot3D.md)
### Github
* [Implementation of ListPlot3D](https://github.com/axkr/symja_android_library/blob/master/symja_android_library/matheclipse-core/src/main/java/org/matheclipse/core/reflection/system/ListPlot3D.java#L14) 
