package com.heydon.ezheli.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class ApplyingAwards {
    private long stuId;
    private String stuName;
    private String awardName;
    private String teacName;
    private String reason;
    private String checkResult;
    private String checkTime;
    private String applyTime;

}
