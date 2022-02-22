# **(Not compatable) for Kotlin Class only use for Java class**

# HashSelector

This Project is easy to make  the field object have multiple primary key
the sample e.g.
if you have class look like this
```
public class Info  extends BaseInfoChecker{
    @AIChecker
    private int id;
    @AIChecker
    private String name;

    public Info (int id  , String name){
        this.id = id;
        this.name = name;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;

    }
}
```
You can add the annotation to your field @AIChecker it means that field is the primaryKey

implement to Android Studio Gradle

```  
  compile('com.leraxcode.hashselector:hashselector:1.0.9') {
        exclude group: 'org.apache.commons', module: 'commons-lang3'
    }
```  
