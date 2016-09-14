package lawonga.simplereno_4.helper;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import lawonga.simplereno_4.model.enums.Key;

/**
 * @Singleton Created by Andy on 9/13/2016.
 * Help us use SharedPreferences
 */
public class PreferencesHelper {
    private Context context;
    private static SharedPreferences sharedPreferences;
    private static PreferencesHelper preferencesHelper = new PreferencesHelper();

    /**
     * Use this to initialize singleton
     *
     * @param context you need to pass in a context
     * @return PreferencesManager
     */
    public static PreferencesHelper initInstance(Context context) {
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        return preferencesHelper;
    }

    /**
     * Use this to get singleton instance after initialization
     *
     * @return PreferencesManager
     */
    public static PreferencesHelper getInstance() throws Exception {
        if (sharedPreferences == null) {
            throw new Exception("Initialize SharedPreferences First!");
        }
        return preferencesHelper;
    }

    /**
     * Put string
     *
     * @param key   Key
     * @param value String
     */
    public void put(Key key, String value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key.name(), value);
        editor.apply();
    }

    /**
     * Put int
     *
     * @param key   Key
     * @param value int
     */
    public void put(Key key, int value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(key.name(), value);
        editor.apply();
    }

    /**
     * Put boolean
     *
     * @param key   Key
     * @param value boolean
     */
    public void put(Key key, boolean value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(key.name(), value);
        editor.apply();
    }

    /**
     * Put long
     *
     * @param key   Key
     * @param value long
     */
    public void put(Key key, long value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putLong(key.name(), value);
        editor.apply();
    }

    /**
     * Put float
     *
     * @param key   Key
     * @param value float
     */
    public void put(Key key, float value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putFloat(key.name(), value);
        editor.apply();
    }

    /**
     * @param key to pass through
     * @return a String from SharedPreferences
     */
    public String getString(Key key) {
        return sharedPreferences.getString(key.name(), "");
    }

    /**
     * @param key to pass through
     * @return a boolean from SharedPreferences
     */
    public boolean getBoolean(Key key) {
        return sharedPreferences.getBoolean(key.name(), false);
    }

    /**
     * @param key to pass through
     * @return an int from SharedPreferences
     */
    public int getInt(Key key) {
        return sharedPreferences.getInt(key.name(), 0);
    }

    /**
     * @param key to pass through
     * @return a long from SharedPreferences
     */
    public long getLong(Key key) {
        return sharedPreferences.getLong(key.name(), 0L);
    }

    /**
     * @param key to pass through
     * @return a float from SharedPreferences
     */
    public float getFloat(Key key) {
        return sharedPreferences.getFloat(key.name(), 0F);
    }
}

