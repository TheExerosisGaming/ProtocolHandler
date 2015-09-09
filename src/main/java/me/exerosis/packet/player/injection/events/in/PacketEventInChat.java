package me.exerosis.packet.player.injection.events.in;

import me.exerosis.packet.player.injection.events.PacketEvent;
import me.exerosis.packet.player.injection.packet.player.PacketPlayer;
import me.exerosis.reflection.Reflect;
import net.minecraft.server.v1_8_R1.PacketPlayInChat;

public final class PacketEventInChat extends PacketEvent {

    public PacketEventInChat(PacketPlayInChat packet, PacketPlayer player) {
        super(packet, player, true);
    }

    public String getMessage() {
        return Reflect.Field(getPacket(), String.class, 0).getValue();
    }

    public void setMessage(String message) {
        Reflect.Field(getPacket(), String.class, 0).setValue(message);
    }
}
