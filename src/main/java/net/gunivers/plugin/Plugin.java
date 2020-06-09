package net.gunivers.plugin;

import discord4j.core.DiscordClient;

public interface Plugin {

    public void load(DiscordClient client);

}
