package services

import dataClasses.*
import org.junit.Assert.*
import org.junit.Test


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
        comments = Comment(8, true, true, true, true),
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

    val wallService = WallService();

    @Test
    fun addFunctionTest() {
        val result = wallService.add(post1);
        println(result.id)
        assertEquals(result, post1)
    }

    @Test
    fun updateFunction_updateExistPost() {
        val expected = true;
        println(wallService.add(post1).id)
        println(wallService.add(post2).id)
        println(wallService.add(post3).id)
        val result = wallService.update(post2ForUpdate)
        assertEquals(expected, result)

    }

    @Test
    fun updateFunction_updateUnexistPost() {
        val expected = false;
        wallService.add(post1)
        wallService.add(post2)
        wallService.add(post3)
        val result = wallService.update(post3)
        assertEquals(expected, result)

    }
}