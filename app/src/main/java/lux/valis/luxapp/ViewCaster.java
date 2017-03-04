package lux.valis.luxapp;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by randy on 2/17/17.
 */

// various helper methods for casting between stuff
public class ViewCaster {
    public static TextView asTextView(View view) {
        // cast
        return (TextView)view;
    }

    public static View asView(TextView view) {
        return (View)view;
    }

    public static String asString(CharSequence c) {
        return (String)c;
    }
}
