package com.example.cl.fengkuangandroiddemo2;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
/**
 * UI组件都是可以通过new关键创建出来的，然后程序使用LineraLayout容器来“盛装”这些组件，这样就组成了图形用户界面。
 * 无论创建哪种UI组件，都需要传入一个this参数，这个是由于创建UI组件时传入一个Context参数，Context代表访问Android
 * 应用环境的全局信息的API。让UI组件持有一个Context参数，可让这些UI组件通过该Context参数来获取Android应用环境的
 * 全局信息。Context本事是一个抽象类，Android的应用的Activity、Service都是继承了Context，因此Activity、Service
 * 都可以作为Context使用。
 * 完全代码控制UI界面不仅不利于高层次的解耦，而且由于通过new关键字来创建UI组件，需要调用方法来设置UI组件的行为，
 * 一次代码显得十分臃肿。
 */
public class MainActivity extends Activity {
//当第一次创建Activity时回调该方法
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //创建一个线性布局管理器
        LinearLayout layout = new LinearLayout(this);
        //设置该Acitvity显示layout
        super.setContentView(layout);
        layout.setOrientation(LinearLayout.VERTICAL);
        //创建一个TextView
        final TextView show = new TextView(this);
        //创建一个按钮
        Button bn = new Button(this);
        bn.setText(R.string.hello_world);
        bn.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));
        //想Layout容器中添加TextView
        layout.addView(show);
        //想Layout容器中添加按钮
        layout.addView(bn);
        //为按钮绑定一个事件监听
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show.setText("Hello , Andorid , "+ new java.util.Date());
            }
        });
      //  setContentView(R.layout.activity_main);
    }
}
