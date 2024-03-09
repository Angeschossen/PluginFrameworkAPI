package com.github.angeschossen.pluginframework.api.trusted;

import com.github.angeschossen.pluginframework.api.player.PlayerData;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.UUID;

public interface RoleHolder {
    boolean isAllowRegionMembers();

    void setAllowRegionMembers(boolean allowRegionMembers);

    @NotNull UUID getOwner();

    void setOwner(UUID uid);

    String getOwnerName();

    void openMenu(@NotNull PlayerData opener);

    @NotNull SimpleRole getRole(@NotNull UUID uid);

    @NotNull Collection<UUID> getTrusted();

    boolean isTrusted(@NotNull UUID uid);

    void setRole(@NotNull UUID uid, @NotNull SimpleRole role)throws IllegalArgumentException;

    boolean trustPlayer(@NotNull UUID uid);

    /**
     * Untrust a player that is trusted directly to this protection.
     *
     * @param playerUUID The player to untrust
     */
    boolean untrustPlayer(@NotNull UUID playerUUID);
}
