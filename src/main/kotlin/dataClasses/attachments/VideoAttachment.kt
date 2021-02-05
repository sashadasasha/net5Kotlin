package dataClasses.attachments

import dataClasses.attachments.units.Video

data class VideoAttachment (
    override val type: String = "Video",
    val video : Video
) : Attachment
