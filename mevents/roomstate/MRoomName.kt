package net.micromes.makocommons.mevents.roomstate

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonTypeName
import net.micromes.makocommons.mevents.ContentEventType

@JsonTypeName("m.room.name")
class MRoomName(
    override val sender: String,
    @JsonProperty("event_id")
    override val id: String?,
    override val content: Content,
    @JsonProperty("state_key")
    override val stateKey: String,
    @JsonProperty("prev_content")
    override val prevContent: Content?
) : MatrixStateEvent {
    @ContentEventType(MRoomName::class)
    data class Content(
        val name: String
    ) : StateEventContent
}