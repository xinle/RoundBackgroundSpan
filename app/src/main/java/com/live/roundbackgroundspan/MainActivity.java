package com.live.roundbackgroundspan;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.widget.TextView;

import com.live.roundbackgroundspanlib.RoundedBackgroundSpan;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView1 = findViewById(R.id.textview1);
        TextView textView2 = findViewById(R.id.textview2);
        TextView textView3 = findViewById(R.id.textview3);
        SpannableStringBuilder stringBuilder = setSpanContent(0);
        textView1.setText(stringBuilder);
        SpannableStringBuilder stringBuilder1 = setSpanContent(1);
        textView2.setText(stringBuilder1);
        SpannableStringBuilder stringBuilder2 = setSpanContent(2);
        textView3.setText(stringBuilder2);
    }

    private SpannableStringBuilder setSpanContent(int type) {
        String content1 = "菩提本无树";
        String content2 = "明镜亦非台";
        String content3 = "本来无一物";
        String content4 = "何处惹尘埃";

        SpannableStringBuilder stringBuilder = new SpannableStringBuilder();
        if(type == 0) {
            stringBuilder.append(content1);
            RoundedBackgroundSpan backSpan = new RoundedBackgroundSpan(Color.parseColor("#E95C37"), Color.WHITE, dp2px(this, 5));
            stringBuilder.setSpan(backSpan,
                    stringBuilder.length() - content1.length(), stringBuilder.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            stringBuilder.append(",");

            stringBuilder.append(content2);
            stringBuilder.setSpan(new AbsoluteSizeSpan(sp2px(this, 35)),
                    stringBuilder.length() - content2.length(), stringBuilder.length(),
                    Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            stringBuilder.append(",");

            stringBuilder.append(content3);
            RoundedBackgroundSpan backSpan1 = new RoundedBackgroundSpan(Color.parseColor("#37BD64"), Color.parseColor("#FF0000"), dp2px(this, 2));
            stringBuilder.setSpan(backSpan1,
                    stringBuilder.length() - content3.length(), stringBuilder.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            stringBuilder.append(",");

            stringBuilder.append(content4);
            stringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#666666")),
                    stringBuilder.length() - content4.length(), stringBuilder.length(),
                    Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            stringBuilder.setSpan(new AbsoluteSizeSpan(sp2px(this ,11)),
                    stringBuilder.length() - content4.length(), stringBuilder.length(),
                    Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        } else if(type == 1) {

            stringBuilder.append(content1);
            RoundedBackgroundSpan backSpan = new RoundedBackgroundSpan(Color.parseColor("#E95C37"), Color.WHITE, dp2px(this, 20));
            backSpan.leftMargin = dp2px(this, 16);
            backSpan.rightMargin = dp2px(this, 2);
            backSpan.topMargin = -dp2px(this, 4);
            backSpan.leftPadding = dp2px(this ,10);
            backSpan.rightPadding = dp2px(this ,10);
            backSpan.topPadding = dp2px(this ,2);
            backSpan.bottomPadding = dp2px(this,2);
            stringBuilder.setSpan(backSpan,
                    stringBuilder.length() - content1.length(), stringBuilder.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            stringBuilder.append(",");

            stringBuilder.append(content2);
            stringBuilder.setSpan(new AbsoluteSizeSpan(sp2px(this, 35)),
                    stringBuilder.length() - content2.length(), stringBuilder.length(),
                    Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            stringBuilder.append(",");

            stringBuilder.append(content3);
            RoundedBackgroundSpan backSpan1 = new RoundedBackgroundSpan(dp2px(this ,1) ,Color.RED ,Color.GRAY , (int) dp2px(this ,2));
            stringBuilder.setSpan(backSpan1,
                    stringBuilder.length() - content3.length(), stringBuilder.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            stringBuilder.append(",");

            stringBuilder.append(content4);
            stringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#666666")),
                    stringBuilder.length() - content4.length(), stringBuilder.length(),
                    Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            stringBuilder.setSpan(new AbsoluteSizeSpan(sp2px(this ,11)),
                    stringBuilder.length() - content4.length(), stringBuilder.length(),
                    Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        } else if(type == 2) {

            stringBuilder.append(content1);
            RoundedBackgroundSpan backSpan = new RoundedBackgroundSpan(Color.parseColor("#E95C37"), Color.WHITE, dp2px(this, 5));
            backSpan.leftMargin = dp2px(this, 16);
            backSpan.rightMargin = dp2px(this, 2);
            backSpan.topMargin = -dp2px(this, 8);
            backSpan.leftPadding = dp2px(this ,4);
            backSpan.rightPadding = dp2px(this ,4);
            backSpan.topPadding = dp2px(this ,4);
            backSpan.bottomPadding = dp2px(this,4);
            stringBuilder.setSpan(backSpan,
                    stringBuilder.length() - content1.length(), stringBuilder.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            stringBuilder.append(",");

            stringBuilder.append(content2);
            stringBuilder.setSpan(new AbsoluteSizeSpan(sp2px(this, 35)),
                    stringBuilder.length() - content2.length(), stringBuilder.length(),
                    Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            stringBuilder.append(",");

            stringBuilder.append(content3);
            RoundedBackgroundSpan backSpan1 = new RoundedBackgroundSpan(dp2px(this ,1) ,Color.RED ,Color.GRAY , (int) dp2px(this ,2));
            backSpan1.leftMargin = dp2px(this, 8);
            backSpan1.rightMargin = dp2px(this, 2);
            backSpan1.topMargin = -dp2px(this, 4);
            backSpan1.leftPadding = dp2px(this ,2);
            backSpan1.rightPadding = dp2px(this ,2);
            backSpan1.topPadding = dp2px(this ,2);
            backSpan1.bottomPadding = dp2px(this,2);
            stringBuilder.setSpan(backSpan1,
                    stringBuilder.length() - content3.length(), stringBuilder.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            stringBuilder.append(",");

            stringBuilder.append(content4);
            stringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#666666")),
                    stringBuilder.length() - content4.length(), stringBuilder.length(),
                    Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            stringBuilder.setSpan(new AbsoluteSizeSpan(sp2px(this ,11)),
                    stringBuilder.length() - content4.length(), stringBuilder.length(),
                    Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        }

        return stringBuilder;
    }

    public static float dp2px(Context context, float dipValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dipValue * scale + 0.5f);
    }

    public static int sp2px(Context context, float spVal) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP,
                spVal, context.getResources().getDisplayMetrics());
    }

}


