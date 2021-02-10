package dataClasses.attachments

import dataClasses.attachments.units.Audio

data class AudioAttachment(
    override val type: String = "Audio",
    val audio : Audio
) : Attachment
