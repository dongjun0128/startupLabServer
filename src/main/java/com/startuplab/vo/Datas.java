package com.startuplab.vo;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Datas {
    private int data_id;
    private int work_id;
    private String data_json;
    private int user_id;
    private int data_status;
    private LocalDateTime create_time;
    private LocalDateTime update_time;
}