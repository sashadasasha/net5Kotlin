package dataClasses

/**
 * Created by Kornyukhina Sasha on 31.01.2021 20:23
 */
data class Post (var id : Int,
                 val ownerId : Int,
                 val fromId : Int,
                 val createdBy : Int,
                 val date : Int,
                 val text : String,
                 val replyOwnerId : Int,
                 val replyPostId : Int,
                 val friendsOnly : Boolean,
                 val comments : Comment,
                 val copyright : Copyright,
                 val likes : Like,
                 val reposts : Repost,
                 val views : View,
                 val postType : String,
                 val signerId : Int,
                 val canPin : Boolean,
                 val canDelete : Boolean,
                 val canEdit : Boolean,
                 val isPinned : Boolean,
                 val markedAsAds : Boolean,
                 val isFavorite : Boolean,
                 val donut : Donut,
                 val postponedId : Int) {
}