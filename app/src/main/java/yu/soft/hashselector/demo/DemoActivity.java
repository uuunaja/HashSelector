package yu.soft.hashselector.demo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.leraxcode.hashselector.model.Info;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by uuuuuuuuuuuuu on 6/12/2015.
 */
public class DemoActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView tv = new TextView(this);
        tv.setText("Plase See DebugLog");
        setContentView(tv);
//        Info info1 = new Info(55 , "a");
//        Info info2 = new Info(55 , "a");
//  test merge request
        case1();
        case2();
        case3();
        case4();
        case5();
        case6();
//        tv.setText();
    }

        private void case1(){
        Info info1 = new Info(55 , "a");
        Info info2 = new Info(55 , "a");
        Log.d("test.obj", "case1 " + info1.equals(info2));
    }


    private void case2(){

        Info info1 = new Info(55 , "a");
        Info info2 = new Info(55 , "b");

//        System.out.print("Info1=Info2 " + info1.equals(info2)  );
        Log.d("test.obj", "case2 " + info1.equals(info2));
    }
    private void case3(){
        Info info1 = new Info(55 , "a");
        Info info2 = new Info(55 , "b");

//        System.out.print("Info1=Info2 " + (info1 == info2)  );
        Log.d("test.obj", "case3 " +  (info1 == info2));
    }
    private void case4(){
        Info info1 = new Info(55 , "a");
        Info info2 = new Info(55 , "b");

//        System.out.print("Info1=Info2 " + info1.equals(info2)  );
        Log.d("test.obj", "case4 " + info1.equals(null));
    }
    private void case5(){
        Info info1 = new Info(55 , "a");
        Info info2 = new Info(55 , "b");
        List<Info> list = new ArrayList<Info>();
        list.add(info1);
        list.add(info2);
        Info infofree = new Info(55 ,"a");
//        System.out.print("Info1=Info2 " + list.contains(infofree) );


        Log.d("test.obj", "case5 " +   list.contains(infofree));
    }

    private void case6(){
        Info info1 = new Info(55 , "a");
        Info info2 = new Info(55 , "b");
        List<Info> list = new ArrayList<Info>();
        list.add(info1);
        list.add(info2);
//        System.out.print("Info1=Info2 " + list.contains(info1) );
        Log.d("test.obj", "case6 " +  list.contains(info1));

    }
}
