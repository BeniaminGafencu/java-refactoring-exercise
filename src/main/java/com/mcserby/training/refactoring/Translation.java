package com.mcserby.training.refactoring;

import java.util.List;

public class Translation {

    private final List<String> values;
    private final String locale;

    public Translation(List<String> values, String locale) {
        this.values = values;
        this.locale = locale;
    }

    public List<String> getValues() {
        return values;
    }

    public String getLocale() {
        return locale;
    }
}
