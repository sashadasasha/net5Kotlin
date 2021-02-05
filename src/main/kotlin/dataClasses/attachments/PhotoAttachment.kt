package dataClasses.attachments

data class PhotoAttachment(
    override val type : String = "Photo",
    override val id: Int,
    override val albumId: Int,
    override val ownerId: Int,
    override val userId: Int
) : Attachment
