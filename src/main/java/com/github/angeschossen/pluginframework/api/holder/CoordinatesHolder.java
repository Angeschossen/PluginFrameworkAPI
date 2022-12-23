package com.github.angeschossen.pluginframework.api.holder;

import com.github.angeschossen.pluginframework.api.blockutil.IBlockPosition;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

public interface CoordinatesHolder {

    boolean isRetrievedCoords();

    CompletableFuture<Map<Integer, ? extends IBlockPosition>> retrieveCoordinates();

    Map<Integer, ? extends IBlockPosition> getCoordinates();

}
