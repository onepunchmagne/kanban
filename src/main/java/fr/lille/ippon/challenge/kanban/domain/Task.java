package fr.lille.ippon.challenge.kanban.domain;

import lombok.Data;

@Data
public class Task {

    private String title;

    public Task(String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException();
        }
        this.title = title;
    }
}
