package com.design.patterns.iterator.config;

import lombok.*;

/**
 * Created by bookboogie on 2015. 10. 18..
 */
@ToString
@AllArgsConstructor
@Getter
@Setter
public class Code {
    @NonNull private String status;
    @NonNull private String key;
    private String value;
}
