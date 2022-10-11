package fr.lille.ippon.challenge.kanban.domain;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Task tests")
@Slf4j
class TaskTest {

    @Test
    @DisplayName("Should get title of task")
    void should_get_title() {
        // Given
        final String expectedTitle = "My Title";
        final Task task = new Task(expectedTitle);

        // When
        final String title = task.getTitle();

        // Then
        Assertions.assertEquals(expectedTitle, title);
    }
}
