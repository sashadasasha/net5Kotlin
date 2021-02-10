package services

import dataClasses.*
import exceptions.PostNotFoundException
import org.junit.Assert.*
import org.junit.Test
import services.WallService.add
import services.WallService.createComment
import services.WallService.update


/**
 * Created by Kornyukhina Sasha on  21:24
 */
class WallServiceTest {
    val post1 = Post(
        id = 0,
        ownerId = 2,
        fromId = 3,
        createdBy = 2,
        date = 123465,
        text = "test1 post",
        replyOwnerId = 1,
        replyPostId = 1,
        friendsOnly = false,
        comments = Comment(8, 1, "Comm"),
        copyright = Copyright(6, "", "", ""),
        likes = Like(36, true, true, true),
        reposts = Repost(4, true),
        views = View(96),
        postType = "",
        signerId = 2,
        canPin = true,
        canDelete  = true,
        canEdit = true,
        isPinned = false,
        markedAsAds = false,
        isFavorite  = false,
        donut = Donut(false, 0, Placeholder(), false, ""),
        postponedId = 2,
        attachments = null)

    val post2 = Post(
        id = 0,
        ownerId = 4,
        fromId = 3,
        createdBy = 2,
        date = 12346536,
        text = "test2 post",
        replyOwnerId = 1,
        replyPostId = 1,
        friendsOnly = true,
        comments = Comment(3, 2,"Some comment"),
        copyright = Copyright(1, "", "", ""),
        likes = Like(69, true, true, true),
        reposts = Repost(32, true),
        views = View(365),
        postType = "",
        signerId = 2,
        canPin = true,
        canDelete  = true,
        canEdit = true,
        isPinned = false,
        markedAsAds = false,
        isFavorite  = false,
        donut = Donut(false, 0, Placeholder(), false, ""),
        postponedId = 2,
        attachments = null)

    val post2ForUpdate = Post(
        id = 3,
        ownerId = 4,
        fromId = 3,
        createdBy = 2,
        date = 12346536,
        text = "test2 post updated!!",
        replyOwnerId = 1,
        replyPostId = 1,
        friendsOnly = true,
        comments = Comment(3, 3, "Comment"),
        copyright = Copyright(1, "", "", ""),
        likes = Like(69, true, true, true),
        reposts = Repost(32, true),
        views = View(365),
        postType = "",
        signerId = 2,
        canPin = true,
        canDelete  = true,
        canEdit = true,
        isPinned = false,
        markedAsAds = false,
        isFavorite  = false,
        donut = Donut(false, 0, Placeholder(), false, ""),
        postponedId = 2,
        attachments = null)

    val post3 = Post(
        id = 0,
        ownerId = 1,
        fromId = 3,
        createdBy = 2,
        date = 126536,
        text = "test3 post",
        replyOwnerId = 1,
        replyPostId = 1,
        friendsOnly = true,
        comments = Comment(15, 3, "smth"),
        copyright = Copyright(6, "", "", ""),
        likes = Like(152, true, true, true),
        reposts = Repost(10, true),
        views = View(536),
        postType = "",
        signerId = 2,
        canPin = true,
        canDelete  = true,
        canEdit = true,
        isPinned = false,
        markedAsAds = false,
        isFavorite  = false,
        donut = Donut(false, 0, Placeholder(), false, ""),
        postponedId = 2,
        attachments = null)

    @Test
    fun createCommentTest_PostIsFound() {
        add(post1)
        val result = createComment(Comment(5,1, "Some message"))
        assertEquals(true, result);

    }

    @Test(expected = PostNotFoundException::class)
    fun createCommentTest_PostIsNotFound() {
        createComment(Comment(3,25, "mes"))
    }

    @Test
    fun addFunctionTest() {
        val result = add(post1)
        val expected = post1.copy(id = 7)
        println(result.id)
        assertEquals(result, expected)
    }

    @Test
    fun updateFunction_updateExistPost() {
        val expected = true;
        add(post1)
        add(post2)
        add(post3)
        val result = update(post2ForUpdate)
        assertEquals(expected, result)

    }

    @Test
    fun updateFunction_updateUnexistPost() {
        val expected = false;
        add(post1)
        add(post2)
        val result = update(post3)
        assertEquals(expected, result)

    }
}