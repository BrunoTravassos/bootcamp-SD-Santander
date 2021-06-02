package com.project.bootcampSantander.exceptions;

import com.project.bootcampSantander.util.MessageUtils;

public class NotFoundException extends RuntimeException{

    public NotFoundException(){
        super(MessageUtils.NO_RECORDS_FOUND);
    }
}
