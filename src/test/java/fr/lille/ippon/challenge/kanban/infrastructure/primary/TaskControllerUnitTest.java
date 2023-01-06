package fr.lille.ippon.challenge.kanban.infrastructure.primary;

import fr.lille.ippon.challenge.kanban.domain.Task;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.*;

@ExtendWith(SpringExtension.class)
class TaskControllerUnitTest {

    @InjectMocks
    private TaskController controller;

    @Test
    void shouldGetTasks() {
        assertThat(controller.getTasks()).contains(new Task("my first task"));
    }

}