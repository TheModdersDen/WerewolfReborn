package com.themoddersden.extras.utils;

import org.bukkit.Keyed;
import org.bukkit.NamespacedKey;
import org.jetbrains.annotations.NotNull;

public enum SoundList implements Keyed{

    SHULTZ_1("sounds.tv.hh.characters.shultz.nothing"),
    SHULTZ_2("sounds.tv.hh.characters.shultz.naughty"),
    SHULTZ_3("sounds.tv.hh.characters.shultz.pancake"),
    KLINK_1("sounds.tv.hh.characters.klink.dissmissed");

    private final NamespacedKey key;

    private SoundList(String key) {
        this.key = NamespacedKey.minecraft(key);
    }

    @NotNull
    @Override
    public NamespacedKey getKey() {
        return key;
    }
    
}
