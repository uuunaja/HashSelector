package com.leraxcode.hashselector.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import com.leraxcode.hashselector.base.AIChecker;

/**
 * Created by uuuuuuuuuuuuu on 4/16/2015.
 */
public abstract class BaseInfoChecker{


    @Override
    public int hashCode() {


//
//
//        return new HashCodeBuilder(17, 31). // two randomly chosen prime numbers
//                // if deriving: appendSuper(super.hashCode()).
//                append(hashCode).
//
//                toHashCode();

        return processHashCode();

    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Info))
            return false;
        if (obj == this)
            return true;

        Info rhs = (Info) obj;




        return new EqualsBuilder().
                // if deriving: appendSuper(super.equals(obj)).
                        append(hashCode(), rhs.hashCode()).
                isEquals();
    }
//talk p'tia about equal vs ==
     protected   int processHashCode(){
        String id="";
         HashCodeBuilder builder = new HashCodeBuilder(17, 31);
        Field [] fields = this.getClass().getDeclaredFields();
          boolean noChecker  = true;
        for(Field f : fields){
            if(isDeclarCheck(f)){
                f.setAccessible(true);

//                id+= getValue(this , f);

                builder.append(getValue(this,f));

                noChecker = false;
            }


        }
         if(noChecker){
             return super.hashCode();
         }
        return builder.toHashCode();
    }


    private boolean isDeclarCheck(Field f){
        Annotation[] as =  f.getDeclaredAnnotations();
        for(Annotation a :as){

            if(a instanceof AIChecker){
                return true;
            }

        }
        return false;
    }
    private String getValue(Object i , Field f){

        String result = "";
        try {
            result=  f.get(i).toString();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return result;
    }
}
