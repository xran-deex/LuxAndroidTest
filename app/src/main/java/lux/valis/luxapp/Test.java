package lux.valis.luxapp;

import android.view.View;

// This class just implements the OnClickListener interface
// and delegates the function call to the doIt function
// I override the doIt function in lux
public abstract class Test implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        doIt(view);
    }

    public abstract void doIt(View view);
}
