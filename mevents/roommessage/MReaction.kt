package net.micromes.makocommons.mevents.roommessage

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonTypeName
import net.micromes.makocommons.enums.MessageType
import net.micromes.makocommons.mevents.ContentEventType

/**
 * Can not find documentation of this event in specification
 * Is used by the riot client for emotes
 */
@JsonTypeName("m.reaction")
class MReaction(
    override val sender: String,
    @JsonProperty("event_id")
    override val id: String,
    override val content: Content
) : MatrixMessageEvent {
    @JsonIgnoreProperties(ignoreUnknown = true)
    @ContentEventType(MReaction::class)
    data class Content(
        @JsonProperty("msgtype")
        val msgType: MessageType = MessageType.TEXT,
        val body: String
    ) : MessageEventContent
}