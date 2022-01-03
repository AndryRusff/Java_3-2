package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId; //В версиях API ниже 5.7 это поле называется to_id
    private int fromId;
    private int createdBy;
    private int date; //  в формате unixtime
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private boolean friendsOnly;
    private CommentsInfo commentsInfo;
    private Copyright copyright;
    private LikesInfo likesInfo;
    private RepostsInfo repostsInfo;
    private int viewsCount;
    private String[] postType = {"post", "copy", "reply", "postpone", "suggest"};
    private PostSource postSource;
    private Geo geo;
    private int signerId;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private boolean markedAsAds;
    private boolean isFavorite;
    private Donut donut;
    private int postponedId;

}
