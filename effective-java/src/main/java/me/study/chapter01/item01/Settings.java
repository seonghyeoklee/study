package me.study.chapter01.item01;

public class Settings {

    private boolean useAutoSteering;

    private boolean useABS;

    private Settings() {
    }

    private static final Settings SETTINGS = new Settings();

    public static Settings getInstance() {
        return SETTINGS;
    }
}
