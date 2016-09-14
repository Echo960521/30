package com.example.a30;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by 张笑佳 on 2016/9/8.
 */
class CustomView extends View {


        public CustomView(Context context, AttributeSet attrs) {
            super(context, attrs);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);

            //设置画布背景色
            canvas.drawColor(Color.YELLOW);

            Paint paint=new Paint();

            ////绘制矩形，内部不填充
            //抗锯齿
            paint.setAntiAlias(true);

            //画笔颜色
            paint.setColor(Color.RED);

            //设置填充类型
            paint.setStyle(Paint.Style.STROKE);

            //设置画笔宽度
            paint.setStrokeWidth(8);

            //绘制普通矩形
            canvas.drawRect(100, 100, 500, 500, paint);

            //绘制三角形，内部填充
            Path path=new Path();
            path.moveTo(100, 100);
            path.lineTo(200, 500);
            path.lineTo(100, 500);
            path.close();
            paint.setStyle(Paint.Style.FILL);
            canvas.drawPath(path, paint);

            //绘制文本
            paint.setTextSize(60);
            paint.setColor(Color.BLACK);
            paint.setStrikeThruText(false);
            canvas.drawText("你好", 550, 600, paint);

            Path pathText=new Path();
            pathText.addCircle(600,600,200, Path.Direction.CCW);

            canvas.drawTextOnPath("qwertyuiopasdfghjklzxcvdddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd",pathText,0,10,paint);
        }
    }

