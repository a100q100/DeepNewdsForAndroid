package android.support.v7.widget;

import android.os.Build.VERSION;
import android.view.View;

public class TooltipCompat {
    private TooltipCompat() {
    }

    public static void setTooltipText(View view, CharSequence charSequence) {
        if (VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            TooltipCompatHandler.setTooltipText(view, charSequence);
        }
    }
}
