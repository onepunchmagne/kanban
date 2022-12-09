package fr.lille.ippon.challenge.kanban.domain;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

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
        Assertions.assertThat(title).isEqualTo(expectedTitle);
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {" ", "\t"})
    @DisplayName("Should not build without title")
    void should_not_build_without_title(String title) {
        Assertions.assertThatThrownBy(() -> new Task(title)).isExactlyInstanceOf(IllegalArgumentException.class);
    }
}
