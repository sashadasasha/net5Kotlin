package dataClasses.attachments

data class AudioAttachment(
    override val type: String = "Audio",
    override val id: Int,
    override val albumId: Int,
    override val ownerId: Int,
    override val userId: Int
) : Attachment
