package dataClasses.attachments

interface Attachment {
    val type : String
    val id : Int
    val albumId : Int
    val ownerId : Int
    val userId : Int
}
