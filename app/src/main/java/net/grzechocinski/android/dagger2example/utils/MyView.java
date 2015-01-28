package net.grzechocinski.android.dagger2example.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class MyView extends View {

    private Paint paint;

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint();
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.FILL);
        paint.setDither(true);
        paint.setAntiAlias(true);
        paint.setTextSize(80);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawText("Test", 100, 100, paint);
    }

    public void redraw() {
        paint.setColor(paint.getColor() == Color.RED ? Color.BLUE : Color.RED);
        invalidate();
    }
}
