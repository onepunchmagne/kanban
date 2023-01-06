package fr.lille.ippon.challenge.kanban.domain;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

@DisplayName("Task tests")
@Slf4j
class TaskTest {

    @Test
    @DisplayName("Should get title of task")
    void shouldGetTitle() {
        // Given
        final String expectedTitle = "My Title";
        final Task task = new Task(expectedTitle);

        // When
        final String title = task.getTitle();

        // Then
        assertThat(title).isEqualTo(expectedTitle);
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {" ", "\t    "})
    void shouldNotCreateTaskWithoutTitle(String title) {
        assertThatThrownBy(() -> new Task(title))
                .isExactlyInstanceOf(IllegalArgumentException.class);
    }
}
