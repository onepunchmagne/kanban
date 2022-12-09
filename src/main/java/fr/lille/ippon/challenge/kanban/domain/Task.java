package fr.lille.ippon.challenge.kanban.domain;

import lombok.Data;

@Data
public class Task {

    public Task(String title) {
        if (title == null || title.isBlank())
            throw new IllegalArgumentException();
        this.title =  title;
    }

    private String title;

}
