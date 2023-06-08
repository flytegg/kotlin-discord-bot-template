package org.example.bot

import net.dv8tion.jda.api.JDABuilder
import net.dv8tion.jda.api.OnlineStatus
import net.dv8tion.jda.api.entities.Activity
import net.dv8tion.jda.api.requests.GatewayIntent

class Bot {

    val jda = JDABuilder.createDefault("token")
        .setStatus(OnlineStatus.DO_NOT_DISTURB)
        .setActivity(Activity.watching("flyte.gg"))
        .enableIntents(GatewayIntent.GUILD_MESSAGES, GatewayIntent.MESSAGE_CONTENT, GatewayIntent.GUILD_MEMBERS)
        .addEventListeners(/* listeners */)
        .build()
        .awaitReady()

    init {
        println(jda.selfUser.name)
    }

}