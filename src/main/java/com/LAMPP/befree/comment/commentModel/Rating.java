package com.LAMPP.befree.comment.commentModel;

import lombok.Getter;

@Getter
public enum Rating {
    VERYPOORLY(1),
    POORLY(2),
    AVERAGE(3),
    WELL(4),
    VERYGOOD(5);
    private final int description;

    Rating(int description) {
        this.description = description;
    }

}
