package paul.cipherresfeber.easytoaster;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {

    // public function to show toast message
    public static void show(Context c, String message){
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show();
    }

}
