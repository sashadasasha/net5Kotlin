package dataClasses.attachments

data class VideoAttachment (
    override val type: String = "Video",
    override val id: Int,
    override val albumId: Int,
    override val ownerId: Int,
    override val userId: Int
) : Attachment
