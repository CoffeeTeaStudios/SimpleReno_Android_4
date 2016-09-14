package lawonga.simplereno_4.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Andy on 9/13/2016.
 */
public class BaseView extends View{
    public BaseView(Context context) {
        super(context);
    }

    public BaseView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BaseView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public BaseView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}
