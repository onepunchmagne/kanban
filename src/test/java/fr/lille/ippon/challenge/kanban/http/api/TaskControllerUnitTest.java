package fr.lille.ippon.challenge.kanban.http.api;

import fr.lille.ippon.challenge.kanban.application.TaskService;
import fr.lille.ippon.challenge.kanban.domain.Task;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(SpringExtension.class)
class TaskControllerUnitTest {

    @InjectMocks
    private TaskController controller;

    @Mock
    private TaskService service;

    @Test
    void shouldGetTasks() {
        when(service.getTasks()).thenReturn(List.of(new Task("my first task")));

        assertThat(controller.getTasks()).contains(new Task("my first task"));
    }

}