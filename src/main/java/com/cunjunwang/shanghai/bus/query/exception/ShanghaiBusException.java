package com.cunjunwang.shanghai.bus.query.exception;

import lombok.*;

/**
 * Created by CunjunWang on 2018-12-22.
 */

@Setter
@Getter
@ToString
@NoArgsConstructor
@EqualsAndHashCode
public class ShanghaiBusException extends RuntimeException {

    private String errCode;

    private String errMsg;

    public static String ERR_PREFIX = "SHBUS-";

    public ShanghaiBusException(String errCode, String errMsg){
        this.errCode = ERR_PREFIX + errCode;
        this.errMsg = errMsg;
    }

}
