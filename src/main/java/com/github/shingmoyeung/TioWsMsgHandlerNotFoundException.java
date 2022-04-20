package com.github.shingmoyeung;

/**
 * @author fanyuepan
 */
public class TioWsMsgHandlerNotFoundException extends RuntimeException {

    public TioWsMsgHandlerNotFoundException() {
        super("IMsgHandler bean not found");
    }
}
