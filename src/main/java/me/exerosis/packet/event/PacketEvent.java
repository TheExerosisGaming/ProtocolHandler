package me.exerosis.packet.event;

import me.exerosis.component.event.Cancellable;
import me.exerosis.packet.player.injection.packet.player.PacketPlayer;
import me.exerosis.packet.wrappers.PacketWrapper;

public class PacketEvent <T extends PacketWrapper> implements Cancellable {
    private T wrapper;
    private PacketPlayer player;
    private boolean canceled;

    public PacketEvent(T wrapper, PacketPlayer player) {
        this.wrapper = wrapper;
        this.player = player;
    }

    public PacketPlayer getPlayer() {
        return player;
    }

    public void setPlayer(PacketPlayer player) {
        this.player = player;
    }

    public T getWrapper() {
        return wrapper;
    }

    public void setWrapper(T wrapper) {
        this.wrapper = wrapper;
    }

    public boolean isCanceled() {
        return canceled;
    }

    public void setCanceled(boolean canceled) {
        this.canceled = canceled;
    }
}