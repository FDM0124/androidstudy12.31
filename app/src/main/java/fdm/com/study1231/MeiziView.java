package fdm.com.study1231;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class MeiziView extends View {
    public float bitmapX;
    public float bitmapY;

    public MeiziView(Context context) {
        super(context);
        //设置妹子的起始位置
        bitmapX=0;
        bitmapY=200;
    }
    //重写View的onDraw()方法
    protected  void onDraw(Canvas canvas){
        super.onDraw(canvas);
        //创建，并且实例化Paint的对象；
        Paint paint =new Paint();
        //根据图片生成位图对象
        Bitmap bitmap =BitmapFactory.decodeResource(this.getResources(),R.drawable.a);
        //绘制萌妹子
        canvas.drawBitmap(bitmap,bitmapX,bitmapY,paint);
        //判断图片是否回收，木有回收的话就强制收回图片
        if(bitmap.isRecycled())
        {
            bitmap.recycle();
        }
    }
}
