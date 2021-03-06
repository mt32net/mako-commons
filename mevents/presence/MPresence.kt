package net.micromes.makocommons.mevents.presence

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonTypeName
import net.micromes.makocommons.mevents.ContentEventType
import net.micromes.makocommons.mevents.EventContent
import net.micromes.makocommons.mevents.MatrixEvent

@JsonTypeName("m.presence")
class MPresence(
        override val sender: String,
        override val content: PresenceContent
) : MatrixEvent {
    @ContentEventType(MPresence::class)
    data class PresenceContent(
        val presence: String,
        @JsonProperty("last_active_ago")
        val lastActiveAgo: Int,
        @JsonProperty("currently_active")
        val currentlyActive: Boolean
    ) : EventContent
}