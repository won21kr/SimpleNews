package de.dala.simplenews;

import android.app.Application;

import de.dala.simplenews.database.DatabaseHandler;
import de.dala.simplenews.network.VolleySingleton;
import de.dala.simplenews.utilities.PrefUtilities;
import de.dala.toasty.Toasty;

/**
 * Created by Daniel on 19.12.13.
 */
public class MainApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        VolleySingleton.init(this);
        DatabaseHandler.init(this);
        Toasty.init(this, "simplenews");
        PrefUtilities.init(this);
    }
}
