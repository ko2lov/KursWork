package com.example.kurswork;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;


public class Signal3 extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signal1);
        //Отрисовочка

        setContentView(new DrawView(this));

        Window w_end = getWindow();
        w_end.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);



    }


        class DrawView extends View {

            Paint p;

            public DrawView(Context context) {
                super(context);
                p = new Paint();
                p.setStrokeWidth(1);
            }




            @Override
            protected void onDraw(Canvas canvas) {
                Display display = getWindowManager().getDefaultDisplay();
                Point size = new Point();//расписать что она делает
                display.getSize(size);//
                int xp = size.x;
                int yp = size.y;
                //Первая линия
                for (int ix = 0; ix < xp; ix++) {
                    p.setColor(Color.BLACK);
                    canvas.drawLine(ix, 0, ix, yp / 8, p);
                }//досконально расписать цикл перебора попиксельно, был с помощью цикла
                //Вторая линяя
                for (int ix = 0; ix < xp; ix++) {
                    if (ix % 2 == 0) {
                        p.setColor(Color.WHITE);
                        canvas.drawLine(ix, yp / 8, ix, (yp / 8) * 2, p);
                    } else {
                        p.setColor(Color.BLACK);
                        canvas.drawLine(ix, yp / 8, ix, (yp / 8) * 2, p);
                    }
                }
                //Третья линия
                for (int ix = 0; ix < xp; ix++) {
                    p.setColor(Color.BLACK);
                    canvas.drawLine(ix, (yp / 8) * 2, ix, (yp / 8) * 3, p);
                }

                //Четвёртая линия
                for (int ix = 0; ix < xp; ix++) {
                    if (ix % 2 == 0) {
                        p.setColor(Color.WHITE);
                        canvas.drawLine(ix, (yp / 8) * 3, ix, (yp / 8) * 4, p);
                    } else {
                        p.setColor(Color.BLACK);
                        canvas.drawLine(ix, (yp / 8) * 3, ix, (yp / 8) * 4, p);
                    }
                }
                //Пятая линия
                for (int ix = 0; ix < xp; ix++) {
                    p.setColor(Color.BLACK);
                    canvas.drawLine(ix, (yp / 8) * 4, ix, (yp / 8) * 5, p);
                }
                //Шестая линия
                for (int ix = 0; ix < xp; ix++) {
                    if (ix % 2 == 0) {
                        p.setColor(Color.WHITE);
                        canvas.drawLine(ix, (yp / 8) * 5, ix, (yp / 8) * 6, p);
                    } else {
                        p.setColor(Color.BLACK);
                        canvas.drawLine(ix, (yp / 8) * 5, ix, (yp / 8) * 6, p);
                    }
                }
                //Седьмая линяя
                for (int ix = 0; ix < xp; ix++) {
                    p.setColor(Color.BLACK);
                    canvas.drawLine(ix, (yp / 8) * 6, ix, yp, p);
                }


            }
        }



}
