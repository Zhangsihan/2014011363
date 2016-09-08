package com.example.graphdrawing;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by 杨浩 on 2016/9/7.
 */
public class CustomView extends View {
    public CustomView(Context context, AttributeSet attributeSet){
        super(context,attributeSet);
    }

    public void onDraw(Canvas canvas){
        super.onDraw(canvas);

        //设置画布背景色
        canvas.drawColor(Color.WHITE);

        Paint paint=new Paint();

        ////绘制矩形，内部不填充
        //抗锯齿
        paint.setAntiAlias(true);

        //画笔颜色
        paint.setColor(Color.BLUE);

        //设置填充类型
        paint.setStyle(Paint.Style.STROKE);

        //设置画笔宽度
        paint.setStrokeWidth(8);

        //绘制普通矩形
        canvas.drawRect(20,20,100,100,paint);

        //绘制三角形，内部填充
        Path path=new Path();
        path.moveTo(10,120);
        path.lineTo(200,120);
        path.lineTo(100,200);
        path.close();
        paint.setStyle(Paint.Style.FILL);
        canvas.drawPath(path,paint);

        //绘制文本
        paint.setTextSize(20);
        paint.setColor(Color.RED);
        paint.setStrikeThruText(true);
        canvas.drawText("初音",10,200,paint);

        Path pathText=new Path();
        pathText.addCircle(200,300,80,Path.Direction.CCW);

        canvas.drawTextOnPath("钢铁侠1,2,3 不良人 绿箭侠 钢铁侠1,2,3 不良人 绿箭侠 钢铁侠1,2,3 不良人 绿箭侠 钢铁侠1,2,3 不良人 绿箭侠 钢铁侠1,2,3 不良人 绿箭侠",pathText,0,10,paint);

    }
}
