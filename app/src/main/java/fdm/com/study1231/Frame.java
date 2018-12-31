package fdm.com.study1231;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

public class Frame extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);
        FrameLayout frameLayout =(FrameLayout)findViewById(R.id.mylayout);

        final MeiziView meiziView =new MeiziView(Frame.this);
        //为我们的萌妹子添加触摸事件监听器
        meiziView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                //设置妹子显示的位置
                meiziView.bitmapX=event.getX()-150;
                meiziView.bitmapY=event.getY()-150;
                //调用重绘方法
                meiziView.invalidate();



                return true;
            }
        });
        frameLayout.addView(meiziView);
    }
}
