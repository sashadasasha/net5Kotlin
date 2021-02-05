package dataClasses.attachments.units

data class Audio(override val id: Int, override val albumId: Int, override val ownerId: Int, override val userId: Int) : AttachmentUnit
