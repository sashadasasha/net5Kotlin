package services

import dataClasses.*
import org.junit.Assert.*
import org.junit.Test
import services.WallService.add
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
        comments = null,
        copyright = null,
        likes = null,
        reposts = null,
        views = View(96),
        postType = "",
        signerId = 2,
        canPin = true,
        canDelete  = true,
        canEdit = true,
        isPinned = false,
        markedAsAds = false,
        isFavorite  = false,
        donut = null,
        postponedId = 2)

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
        comments = Comment(3, true, true, true, true),
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
        postponedId = 2)

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
        comments = Comment(3, true, true, true, true),
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
        postponedId = 2)

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
        comments = Comment(15, true, true, true, true),
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
        postponedId = 2)

    @Test
    fun addFunctionTest() {
        val result = add(post1);
        assertEquals(result, post1.copy(id = 1))
    }

    @Test
    fun updateFunction_updateExistPost() {
        val expected = true;
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