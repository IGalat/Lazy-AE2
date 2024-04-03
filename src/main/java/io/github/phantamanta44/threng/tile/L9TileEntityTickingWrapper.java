package io.github.phantamanta44.threng.tile;

import io.github.phantamanta44.libnine.tile.L9TileEntityTicking;

public abstract class L9TileEntityTickingWrapper extends L9TileEntityTicking {

    @Override
    public void update() {
        // quick and dirty fix for .class diff vs source in libnine
        super.func_73660_a();
    }
}
