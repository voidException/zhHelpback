package org.geilove.vo;

import java.util.Date;

import org.geilove.pojo.Tweet;

public class TweetByTweetVo {

	private Tweet tweet;//这个是转发的推文,是一个对象
	
    private  String userPhoto;//这个是用户的头像
    
	private Long tweetid;

    private Long useridtweet;

    private Long sourcemsgid;

    private Byte tagid;

    private String msgcontent;

    private Long topic;

    private Integer commenttimes;

    private Integer ok;

    private Integer boxtimes;

    private Date publishtime;

    private Integer reportedtimes;

    private Byte publicsee;

    private Byte deletetag;

    private String videoaddress;

    private String tweetbackupone;

    private String tweetbackuptwo;

    private String tweetbackupthree;
    
    private Integer tweetbackupfour;

    private Integer tweetbackupfive;

    private Integer tweetbackupsix;

	public Tweet getTweet() {
		return tweet;
	}

	public void setTweet(Tweet tweet) {
		this.tweet = tweet;
	}

	public Long getTweetid() {
		return tweetid;
	}

	public void setTweetid(Long tweetid) {
		this.tweetid = tweetid;
	}

	public Long getUseridtweet() {
		return useridtweet;
	}

	public void setUseridtweet(Long useridtweet) {
		this.useridtweet = useridtweet;
	}

	public Long getSourcemsgid() {
		return sourcemsgid;
	}

	public void setSourcemsgid(Long sourcemsgid) {
		this.sourcemsgid = sourcemsgid;
	}

	public Byte getTagid() {
		return tagid;
	}

	public void setTagid(Byte tagid) {
		this.tagid = tagid;
	}

	public String getMsgcontent() {
		return msgcontent;
	}

	public void setMsgcontent(String msgcontent) {
		this.msgcontent = msgcontent;
	}

	public Long getTopic() {
		return topic;
	}

	public void setTopic(Long topic) {
		this.topic = topic;
	}

	public Integer getCommenttimes() {
		return commenttimes;
	}

	public void setCommenttimes(Integer commenttimes) {
		this.commenttimes = commenttimes;
	}

	public Integer getOk() {
		return ok;
	}

	public void setOk(Integer ok) {
		this.ok = ok;
	}

	public Integer getBoxtimes() {
		return boxtimes;
	}

	public void setBoxtimes(Integer boxtimes) {
		this.boxtimes = boxtimes;
	}

	public Date getPublishtime() {
		return publishtime;
	}

	public void setPublishtime(Date publishtime) {
		this.publishtime = publishtime;
	}

	public Integer getReportedtimes() {
		return reportedtimes;
	}

	public void setReportedtimes(Integer reportedtimes) {
		this.reportedtimes = reportedtimes;
	}

	public Byte getPublicsee() {
		return publicsee;
	}

	public void setPublicsee(Byte publicsee) {
		this.publicsee = publicsee;
	}

	public Byte getDeletetag() {
		return deletetag;
	}

	public void setDeletetag(Byte deletetag) {
		this.deletetag = deletetag;
	}

	public String getVideoaddress() {
		return videoaddress;
	}

	public void setVideoaddress(String videoaddress) {
		this.videoaddress = videoaddress;
	}

	public String getTweetbackupone() {
		return tweetbackupone;
	}

	public void setTweetbackupone(String tweetbackupone) {
		this.tweetbackupone = tweetbackupone;
	}

	public String getTweetbackuptwo() {
		return tweetbackuptwo;
	}

	public void setTweetbackuptwo(String tweetbackuptwo) {
		this.tweetbackuptwo = tweetbackuptwo;
	}

	public String getTweetbackupthree() {
		return tweetbackupthree;
	}

	public void setTweetbackupthree(String tweetbackupthree) {
		this.tweetbackupthree = tweetbackupthree;
	}

	public Integer getTweetbackupfour() {
		return tweetbackupfour;
	}

	public void setTweetbackupfour(Integer tweetbackupfour) {
		this.tweetbackupfour = tweetbackupfour;
	}

	public Integer getTweetbackupfive() {
		return tweetbackupfive;
	}

	public void setTweetbackupfive(Integer tweetbackupfive) {
		this.tweetbackupfive = tweetbackupfive;
	}

	public Integer getTweetbackupsix() {
		return tweetbackupsix;
	}

	public void setTweetbackupsix(Integer tweetbackupsix) {
		this.tweetbackupsix = tweetbackupsix;
	}

	public String getUserPhoto() {
		return userPhoto;
	}

	public void setUserPhoto(String userPhoto) {
		this.userPhoto = userPhoto;
	}
}
