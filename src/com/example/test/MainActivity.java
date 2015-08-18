package com.example.test;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        System.out.println("hello world");
        Log.d("MainActivity", "这里只是做一个git建立网络代码仓库测试");
        System.out.println("这里也可以写代码");
    }
}
