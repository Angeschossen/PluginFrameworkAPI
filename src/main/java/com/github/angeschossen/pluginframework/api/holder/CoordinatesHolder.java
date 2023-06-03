package com.github.angeschossen.pluginframework.api.holder;

import com.github.angeschossen.pluginframework.api.blockutil.impl.BlockPosition;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

public interface CoordinatesHolder {

    boolean isRetrievedCoords();

    CompletableFuture<Map<Integer, ? extends BlockPosition>> retrieveCoordinates();

    Map<Integer, ? extends BlockPosition> getCoordinates();

}
