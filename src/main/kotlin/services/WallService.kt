package services

import dataClasses.*

/**
 * Created by Kornyukhina Sasha on 31.01.2021 20:48
 */
object WallService {
     private var posts = emptyArray<Post>()
    /**
     * Пока так назначать id буду
     */
    fun add(post: Post): Post {
        val newId = if (posts.isEmpty())  1 else posts.last().id + 1
        val newPost = post.copy(id = newId)
        posts += newPost
        return posts.last()
    }

    fun update(post: Post) : Boolean {
        for ((index, postInArray) in posts.withIndex()) {
            if (postInArray.id == post.id) {
                val newVersionOfPost = posts[index].copy(
                ownerId = post.ownerId,
                fromId = post.fromId,
                createdBy = post.createdBy,
                text = post.text,
                replyOwnerId = post.replyOwnerId,
                replyPostId = post.replyPostId,
                friendsOnly = post.friendsOnly,
                comments = post.comments,
                copyright = post.copyright,
                likes = post.likes,
                reposts = post.reposts,
                views = post.views,
                postType = post.postType,
                signerId = post.signerId,
                canPin = post.canPin,
                canDelete  = post.canDelete,
                canEdit = post.canEdit,
                isPinned = post.isPinned,
                markedAsAds = post.markedAsAds,
                isFavorite  = post.isFavorite,
                donut = post.donut,
                postponedId = post.postponedId
                )
                posts[index] = newVersionOfPost
                return true
            }
        }
        return false
    }
}