package com.leraxcode.hashselector.model;

import com.leraxcode.hashselector.base.AIChecker;

/**
 * Created by uuuuuuuuuuuuu on 4/16/2015.
 */

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


//    @Override
//    public int hashCode() {
//        return new HashCodeBuilder(17, 31). // two randomly chosen prime numbers
//                // if deriving: appendSuper(super.hashCode()).
//                append(id).
//                append(name).
//                toHashCode();
//
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (!(obj instanceof Info))
//            return false;
//        if (obj == this)
//            return true;
//
//        Info rhs = (Info) obj;
//        return new EqualsBuilder().
//                // if deriving: appendSuper(super.equals(obj)).
//                        append(id, rhs.id).
//                        append(name, rhs.name).
//
//                isEquals();
//    }

//    @Override
//    public int hashCode() {
//        return new HashCodeBuilder(17, 31). // two randomly chosen prime numbers
//                // if deriving: appendSuper(super.hashCode()).
//                append(processHashCode()).
////                append(name).
//                toHashCode();
//
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (!(obj instanceof Info))
//            return false;
//        if (obj == this)
//            return true;
//
//        Info rhs = (Info) obj;
//        return new EqualsBuilder().
//                // if deriving: appendSuper(super.equals(obj)).
//                        append(processHashCode(), rhs.processHashCode()).
//
//
//                isEquals();
//    }
//
//    private String processHashCode(){
//        String id=null;
//        Field[] fields = Info.class.getDeclaredFields();
//        for(Field f : fields){
//            if(isDeclarCheck(f)){
//                f.setAccessible(true);
//
//                id+= getValue(this , f);
//            }
//
//
//        }
//        return id;
//    }
//
//
//    private boolean isDeclarCheck(Field f){
//        Annotation[] as =  f.getDeclaredAnnotations();
//        for(Annotation a :as){
//
//            if(a instanceof AIChecker){
//                return true;
//            }
//
//        }
//        return false;
//    }
//    private String getValue(Object i , Field f){
//
//        String result = "";
//        try {
//            result=  f.get(i).toString();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }
//        return result;
//    }
}
