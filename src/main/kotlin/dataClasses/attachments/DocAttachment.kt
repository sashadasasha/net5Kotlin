package dataClasses.attachments

import dataClasses.attachments.units.Doc

data class DocAttachment (
    override val type: String = "Doc",
    val doc : Doc
) : Attachment {
}