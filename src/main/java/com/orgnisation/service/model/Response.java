package com.orgnisation.service.model;

/**
 * @author Rafeeq Ali Shaik
 *
 */
/**
 * The Class Response.
 */
public class Response {

    /** The content. */
    private Object content;

    /** The message. */
    private String message;

    /**
     * Instantiates a new response.
     */
    public Response() {
	super();
    }

    /**
     * Instantiates a new response.
     *
     * @param message
     *            the message
     */
    public Response(String message) {
	this.message = message;
    }

    /**
     * Instantiates a new response.
     *
     * @param content
     *            the content
     * @param message
     *            the message
     */
    public Response(Object content, String message) {
	super();
	this.content = content;
	this.message = message;
    }

    /**
     * Gets the content.
     *
     * @return the content
     */
    public Object getContent() {
	return content;
    }

    /**
     * Sets the content.
     *
     * @param content
     *            the new content
     */
    public void setContent(Object content) {
	this.content = content;
    }

    /**
     * Gets the message.
     *
     * @return the message
     */
    public String getMessage() {
	return message;
    }

    /**
     * Sets the message.
     *
     * @param message
     *            the new message
     */
    public void setMessage(String message) {
	this.message = message;
    }
}