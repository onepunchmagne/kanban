package fr.lille.ippon.challenge.kanban.application;

import fr.lille.ippon.challenge.kanban.domain.Task;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class TaskService {

    public Collection<Task> getTasks() {
        return List.of();
    }
}
