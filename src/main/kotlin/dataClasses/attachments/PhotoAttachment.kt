package dataClasses.attachments

import dataClasses.attachments.units.Photo

data class PhotoAttachment(
    override val type : String = "Photo",
    val photo : Photo
) : Attachment
