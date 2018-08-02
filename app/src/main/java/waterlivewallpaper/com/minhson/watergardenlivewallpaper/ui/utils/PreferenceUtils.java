package waterlivewallpaper.com.minhson.watergardenlivewallpaper.ui.utils;

import android.content.Context;
import android.preference.PreferenceManager;

/**
 * Created by Administrator on 12/5/2017.
 */

public class PreferenceUtils {

    public static void save(String key, boolean value, Context context) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean(key, value).apply();
    }

    public static boolean getBooleanFromPreference(String key, Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(key, false);
    }

    public static void save(String key, int value, Context context) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putInt(key, value).apply();
    }

    public static int getIntFromPreference(String key, Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt(key, -1);
    }

    public static void save(String key, String value, Context context) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString(key, value).apply();
    }

    public static String getStringFromPreference(String key, Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString(key, "");
    }
}
