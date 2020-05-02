package utilities;

import android.view.View;

import com.google.android.material.snackbar.Snackbar;
import com.jedi_supreme.hospitalmanagement.R;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;


public class common {

    private static String time_to_date(String timeMillis){

        Calendar calendar = Calendar.getInstance();

        calendar.setTimeInMillis(Long.parseLong(timeMillis));

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:MM:SS", Locale.getDefault());

        return  simpleDateFormat.format(calendar.getTime());
    }

    public static Snackbar Mysnackbar(View parent_view, String message, int lenght) {

        final Snackbar snackbar = Snackbar.make(parent_view, message, lenght);
        snackbar.setActionTextColor(parent_view.getContext().getResources().getColor(R.color.colorPrimary));
        snackbar.setAction("Close", v -> snackbar.dismiss());

        return snackbar;
    }

}
