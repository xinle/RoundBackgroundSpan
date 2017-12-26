package com.live.roundbackgroundspanlib;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;

public class RoundedBackgroundSpan extends ReplacementSpan {

    public int backgroundColor = 0;
    private int textColor = 0;
    private float radius;
    public float leftMargin;
    public float rightMargin;
    public float topMargin;

    public float leftPadding;
    public float rightPadding;
    public float topPadding;
    public float bottomPadding;

    public float borderWidth;
    public int borderColor;

    public RoundedBackgroundSpan(int backgroundColor ,int textColor, float radius) {
        super();
        this.backgroundColor = backgroundColor;
        this.textColor = textColor;
        this.radius = radius;
    }

    public RoundedBackgroundSpan(float borderWidth ,int borderColor ,int textColor ,int radius) {
        super();
        this.borderWidth = borderWidth;
        this.borderColor = borderColor;
        this.textColor = textColor;
        this.radius = radius;
    }

    @Override
    public void draw(Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, Paint
            paint) {
        if (canvas == null || paint == null) {
            return;
        }
        Paint.FontMetrics fm = paint.getFontMetrics();
        if (fm == null) {
            return;
        }

        float rectTop = y + fm.ascent + topMargin;
        RectF rect = new RectF(x - leftPadding + leftMargin, rectTop - topPadding , x + measureText(paint, text, start, end) +
                rightPadding + leftMargin, rectTop + Math.abs(fm.ascent) + fm.descent + bottomPadding);
        if(backgroundColor != 0) {
            paint.setColor(backgroundColor);
            canvas.drawRoundRect(rect, radius, radius, paint);
        } else if(Float.compare(borderWidth , 0) > 0) {
            Paint paint1 = new Paint();
            paint1.setColor(borderColor);
            paint1.setStyle(Paint.Style.STROKE);
            paint1.setStrokeWidth(borderWidth);
            canvas.drawRoundRect(rect ,radius ,radius ,paint1);
        }
        paint.setColor(textColor);
        canvas.drawText(text, start, end, x + leftMargin, y + topMargin , paint);
    }

    @Override
    public int getSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fm) {
        if (paint == null) {
            return 0;
        }
        return (int) (Math.round(paint.measureText(text, start, end)) + leftMargin + rightMargin + leftPadding + rightPadding);
    }

    private float measureText(Paint paint, CharSequence text, int start, int end) {
        if (paint == null) {
            return 0;
        }
        return paint.measureText(text, start, end);
    }
}